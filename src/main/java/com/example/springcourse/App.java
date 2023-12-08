package com.example.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springcourse.controllers.MusicPlayer;
import com.example.springcourse.interfaces.Music;

public class App {
    /**
     * There is 3 way to set bean
     * 1. From XML file
     */
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");) {
            // #region Add second level bean from
            // secondLevelBean(context);
            // #endregion

            // #region Add second level bean from props using props file
            // injectionFromPropUsingProp(context);
            // #endregion

            // #region Add list of beansform construcor
            // injectionBeansListUsingConstructor(context);
            // #endregion

            // #region compare singleton and prototype bean
            // singletonPrototype(context);
            // #endregion

            // #region init and destroy
            initDestroy(context);
            // #endregion
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void secondLevelBean(ClassPathXmlApplicationContext context) {
        MusicPlayer player = context.getBean("musicPlayerBean", MusicPlayer.class);
        player.play();
    }

    private static void injectionFromPropUsingProp(ClassPathXmlApplicationContext context) {
        MusicPlayer player = context.getBean("musicPlayerBean", MusicPlayer.class);
        player.play();
        System.out.println(player.getName());
        System.out.println(player.getVolume());
    }

    private static void injectionBeansListUsingConstructor(ClassPathXmlApplicationContext context) {
        MusicPlayer player = context.getBean("musicPlayerBean", MusicPlayer.class);
        for (Music music : player.getMusicList()) {
            System.out.println(music.getSong());
        }
    }

    private static void singletonPrototype(ClassPathXmlApplicationContext context) {
        MusicPlayer player = context.getBean("musicPlayerBean", MusicPlayer.class);
        MusicPlayer player2 = context.getBean("musicPlayerBean", MusicPlayer.class);
        System.out.println(player);
        System.out.println(player2);
    }

    private static void initDestroy(ClassPathXmlApplicationContext context) {
        MusicPlayer player = context.getBean("musicPlayerBean", MusicPlayer.class);
    }
}

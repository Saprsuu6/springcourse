package com.example.springcourse;

import javax.sound.midi.SysexMessage;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    /**
     * There is 3 way to set bean
     * 1. From XML file
     */
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");) {
            // #region Add first level bean from constructor
            firstLevelBean(context);
            // #endregion

            // #region Add second level bean from
            secondLevelBean(context);
            // #endregion

            // #region Add second level bean from props using props file
            injectionFromPropUsingProp(context);
            // #endregion
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void firstLevelBean(ClassPathXmlApplicationContext context) {
        Music music = context.getBean("musicBean", Music.class);
        new MusicPlayer(music).play();
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
}

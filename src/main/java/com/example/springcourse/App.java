package com.example.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    /**
     * There is 3 way to set bean
     * 1. From XML file
     */
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");) {
            Music music = context.getBean("musicBean", Music.class);
            MusicPlayer musicPlayer = new MusicPlayer(music);
            musicPlayer.play();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

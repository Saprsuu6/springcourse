package com.example.springcourse.controllers;

import java.util.List;

import com.example.springcourse.interfaces.Music;

public class MusicPlayer {
    private Music music;

    private String name;
    private int volume;
    private List<Music> musicList;

    // #region getters
    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public Music getMusic() {
        return music;
    }

    public List<Music> getMusicList() {
        return musicList;
    }
    // #endregion

    // #region setters
    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusic(Music music) {
        this.music = music;
    }
    // #endregion

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {
    }

    public void play() {
        System.out.println("Playing: " + music.getSong());
    }
}

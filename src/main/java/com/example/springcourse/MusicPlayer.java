package com.example.springcourse;

public class MusicPlayer {
    private Music music;

    private String name;
    private int volume;

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

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {
    }

    public void play() {
        System.out.println("Playing: " + music.getSong());
    }
}

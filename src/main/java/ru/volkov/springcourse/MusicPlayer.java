package ru.volkov.springcourse;

public class MusicPlayer {
    private Music music;

    // IoC - инверсия управления
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}

package ru.volkov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String args[]) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"

        );

        Music music = context.getBean("musicBean", Music.class);
        Music musicJas = context.getBean("musicBeanJas", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayerJas = new MusicPlayer(musicJas);

        musicPlayer.playMusic();
        musicPlayerJas.playMusic();

        context.close();
    }
}

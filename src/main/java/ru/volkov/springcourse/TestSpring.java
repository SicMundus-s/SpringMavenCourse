package ru.volkov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String args[]) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"

        );

        //Music music = context.getBean("musicBean", Music.class);
        //Music musicJas = context.getBean("musicBeanJas", Music.class);

       // MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

       // musicPlayer.playMusic();
        MusicPlayer ms = new MusicPlayer();
        ms.playMusic();


        context.close();
    }
}

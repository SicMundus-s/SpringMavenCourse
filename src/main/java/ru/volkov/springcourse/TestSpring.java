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
        //musicPlayer.playMusic();

        ClassicalMusic classicalMusic = context.getBean("musicBeanClassic", ClassicalMusic.class);
        ClassicalMusic classicalMusic1 = context.getBean("musicBeanClassic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("musicBeanClassic", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());
        System.out.println(classicalMusic1.getSong());
        System.out.println(classicalMusic2.getSong());

        context.close();
    }
}

package com.JavaCodeConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {
        //    Read spring config Java class
        AnnotationConfigApplicationContext ctxt = new AnnotationConfigApplicationContext(Sportconfig.class);
        SwimCoach swimCoach = (SwimCoach) ctxt.getBean("swimCoach");
        System.out.println(swimCoach.getDailyFortune());
        System.out.println(swimCoach.getDailyWorkout());
        ctxt.close();
    }
}

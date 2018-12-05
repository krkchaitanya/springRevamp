package com.springPropFile;

import com.springPropFile.coach.SwimCoach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SportMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctxt = new AnnotationConfigApplicationContext(SportConfig.class);
        SwimCoach swimCoach = (SwimCoach) ctxt.getBean("swimCoach");
        System.out.println("===============");
        System.out.println(swimCoach.getDialyWorkout());
        System.out.println(swimCoach.getEmail());
        System.out.println(swimCoach.getTeam());
        System.out.println(swimCoach.getUserFortuneData());
        System.out.println("==============");
    }
}

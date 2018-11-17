package com.sprinfnew.demoapp;

import com.sprinfnew.demoapp.coach.BaseballCoach;
import com.sprinfnew.demoapp.coach.CircketCoach;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoappApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoappApplication.class, args);

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BaseballCoach baseballCoach = (BaseballCoach) context.getBean("baseballCoach");
        CircketCoach cricketCoach = (CircketCoach) context.getBean("circketCoach");

        System.out.println(baseballCoach.getDailyWorkout());
        System.out.println(baseballCoach.getTimeInformation());
        System.out.println(baseballCoach.getFortuneData());
        System.out.println("--------------------");
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getWebTechnology());
        System.out.println(cricketCoach.getFirstName());


        context.close();
    }
}

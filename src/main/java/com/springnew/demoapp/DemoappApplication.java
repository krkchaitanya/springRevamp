package com.springnew.demoapp;

import com.springnew.demoapp.coach.BaseballCoach;
import com.springnew.demoapp.coach.CricketCoach;
import com.springnew.demoapp.userDataOperations.UserInfoHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoappApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoappApplication.class, args);

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BaseballCoach baseballCoach = (BaseballCoach) context.getBean("baseballCoach");
        CricketCoach cricketCoach = (CricketCoach) context.getBean("cricketCoach");
        UserInfoHandler userInfoHandler = new UserInfoHandler();


        System.out.println(baseballCoach.getDailyWorkout());
        System.out.println(baseballCoach.getTimeInformation());
        System.out.println(baseballCoach.getFortuneData());
        System.out.println("--------------------");
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getWebTechnology());
        System.out.println(cricketCoach.getFirstName());

        System.out.println(userInfoHandler.getUserData().toString());
        System.out.println("Spring Annotations--> "+userInfoHandler.getUserFortune());


        context.close();
    }
}

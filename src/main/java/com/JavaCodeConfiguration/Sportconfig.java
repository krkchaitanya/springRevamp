package com.JavaCodeConfiguration;

import com.springnew.demoapp.coach.Coach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.JavaCodeConfiguration")
public class Sportconfig {

    @Bean
    public Coach swimCoach() {
        SwimCoach swimCoach = new SwimCoach();

        return swimCoach;
    }
}

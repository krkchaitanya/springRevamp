package com.springPropFile;

import com.springPropFile.coach.Coach;
import com.springPropFile.coach.SwimCoach;
import com.springPropFile.services.UserFortune;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.springPropFile")
@PropertySource("classpath:sport.properties")
public class SportConfig {

    @Bean
    public UserFortune getUserFortune(){
        return new UserFortune();
    }

    @Bean
    public Coach swimCoach() {
        return new SwimCoach(getUserFortune());
    }
}

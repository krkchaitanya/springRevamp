package com.JavaCodeConfiguration;

import com.JavaCodeConfiguration.services.FortuneService;
import com.JavaCodeConfiguration.services.SadFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.JavaCodeConfiguration")
public class Sportconfig {

    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());

    }
}

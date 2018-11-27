package com.JavaCodeConfiguration;

import com.JavaCodeConfiguration.services.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach{

    private FortuneService fortuneService;

    public SwimCoach() {
    }

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000meters as a warm up";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}

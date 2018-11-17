package com.sprinfnew.demoapp.coach;

import com.sprinfnew.demoapp.services.FeatureService;

public class BaseballCoach implements Coach{

    private FeatureService featureService;

    public BaseballCoach() {
    }

    public BaseballCoach(FeatureService featureService) {
        this.featureService = featureService;
    }

    @Override
    public String getDailyWorkout() {
        return "Hit the ball with baseball bat";
    }

    @Override
    public String getTimeInformation() {
        return "Spend atleast 12hrs in a day to practice";
    }

    public String getFortuneData() {
        return featureService.getFortune();
    }
}

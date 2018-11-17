package com.sprinfnew.demoapp.coach;

import com.sprinfnew.demoapp.services.FeatureService;

public class CricketCoach implements Coach {
    private FeatureService featureService;
    private String webTechnology;
    private String firstName;

    public CricketCoach() {
    }

    public CricketCoach(FeatureService featureService) {
        this.featureService = featureService;
    }

    public void setWebTechnology(String webTechnology) {
        this.webTechnology = webTechnology;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getDailyWorkout() {
        return "Practise batting and bowling in all the directions";
    }

    @Override
    public String getTimeInformation() {
        return "Try to spend atleat 5overs of time on pitch";
    }

    public String getFortune() {
        return featureService.getFortune();
    }

    public String getWebTechnology() {
        return webTechnology;
    }

    public String getFirstName(){
        return firstName;
    }
}

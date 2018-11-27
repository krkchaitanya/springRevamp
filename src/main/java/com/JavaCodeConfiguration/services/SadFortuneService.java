package com.JavaCodeConfiguration.services;

public class SadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Sad to see the flop movie twice in a week";
    }
}

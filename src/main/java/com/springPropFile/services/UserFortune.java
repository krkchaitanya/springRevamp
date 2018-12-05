package com.springPropFile.services;

import org.springframework.stereotype.Component;

@Component
public class UserFortune implements FortuneService {

    @Override
    public String getFortuneMessage() {
        return "You will get rewarded for the work that you have done";
    }
}

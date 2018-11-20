package com.springnew.demoapp.userDataOperations.userFortune;

import org.springframework.stereotype.Component;

@Component
public class UserFortuneService implements UserFortune {

    @Override
    public String userFortuneData(String fortuneData) {
        return fortuneData;
    }
}

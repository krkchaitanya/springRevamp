package com.springPropFile.coach;

import com.springPropFile.services.UserFortune;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

    @Autowired
    private UserFortune userFortune;

    public SwimCoach() {
    }

    public SwimCoach(UserFortune userFortune) {
        this.userFortune = userFortune;
    }


    @Override
    public String getDialyWorkout() {
        return "Try to swin for 12min continuously without breathing";
    }

    public String getUserFortuneData() {
        return userFortune.getFortuneMessage();
    }
}

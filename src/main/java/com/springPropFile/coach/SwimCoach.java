package com.springPropFile.coach;

import com.springPropFile.services.UserFortune;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

    @Autowired
    private UserFortune userFortune;

    @Value("${foo.email}")
    private String email;
    @Value("${foo.team}")
    private String team;

    public SwimCoach() {
    }

    public SwimCoach(UserFortune userFortune) {
        this.userFortune = userFortune;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String getDialyWorkout() {
        return "Try to swin for 12min continuously without breathing";
    }

    public String getUserFortuneData() {
        return userFortune.getFortuneMessage();
    }
}

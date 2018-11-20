package com.springQualifiers.mobiles;

import com.springQualifiers.services.QualiFortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OnePlus implements Cellphone {

    @Autowired
    @Qualifier("happyFortuneService")
    private QualiFortuneService qualiFortuneService;

    @Override
    public String getCompanyInfo() {
        return qualiFortuneService.getQalifierFortune();
    }

}

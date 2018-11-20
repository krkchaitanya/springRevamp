package com.springQualifiers.services;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements QualiFortuneService {
    @Override
    public String getQalifierFortune() {
        return "Hitting the random fortune service";
    }
}

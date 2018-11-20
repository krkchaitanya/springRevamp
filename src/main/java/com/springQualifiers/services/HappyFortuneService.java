package com.springQualifiers.services;
import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements QualiFortuneService {
    @Override
    public String getQalifierFortune() {
        return "Hitting the HappyFortuneService";
    }
}

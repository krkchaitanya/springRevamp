package com.springQualifiers.services;
import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements QualiFortuneService {
    @Override
    public String getQalifierFortune() {
        return "Hitting the Rest fortune service";
    }
}

package com.springQualifiers.mobiles;

import org.springframework.stereotype.Component;

@Component
public class Micromax implements Cellphone {
    @Override
    public String getCompanyInfo() {
        return "Micromax company from INDIA";
    }
}

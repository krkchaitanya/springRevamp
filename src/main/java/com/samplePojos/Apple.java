package com.samplePojos;

import lombok.Data;

import javax.persistence.Entity;
import java.util.List;

@Entity
@Data
public class Apple {
    private List<String> products;
    private String founder;
    private String placeEst;

    public Apple(List<String> products, String founder, String placeEst) {
        this.products = products;
        this.founder = founder;
        this.placeEst = placeEst;
    }
}

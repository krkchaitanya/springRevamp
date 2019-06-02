package com.samplePojos;

import java.math.BigDecimal;

public class Developer {
    private String developerName;
    private BigDecimal developerSal;
    private int age;

    public Developer(String developerName, BigDecimal developerSal, int age) {
        this.developerName = developerName;
        this.developerSal = developerSal;
        this.age = age;
    }

    public String getDeveloperName() {
        return developerName;
    }

    public void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }

    public BigDecimal getDeveloperSal() {
        return developerSal;
    }

    public void setDeveloperSal(BigDecimal developerSal) {
        this.developerSal = developerSal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "developerName='" + developerName + '\'' +
                ", developerSal=" + developerSal +
                ", age=" + age +
                '}';
    }
}

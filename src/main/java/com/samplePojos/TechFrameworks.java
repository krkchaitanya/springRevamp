package com.samplePojos;

public class TechFrameworks {
    private String name;
    private String developmentPhase;
    private Number version;

    public TechFrameworks(String name, String developmentPhase, Number version) {
        this.name = name;
        this.developmentPhase = developmentPhase;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDevelopmentPhase() {
        return developmentPhase;
    }

    public void setDevelopmentPhase(String developmentPhase) {
        this.developmentPhase = developmentPhase;
    }

    public Number getVersion() {
        return version;
    }

    public void setVersion(Number version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "TechFrameworks{" +
                "name='" + name + '\'' +
                ", developmentPhase='" + developmentPhase + '\'' +
                ", version=" + version +
                '}';
    }
}

package com.iesam.huellas.domain.models;

public class Cat implements Pet {

    public Boolean sick;

    public Boolean getSick() {
        return sick;
    }

    public void setSick(Boolean sick) {
        this.sick = sick;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Integer getId() {
        return null;
    }

    @Override
    public String getDateBirth() {
        return null;
    }

    @Override
    public String getGender() {
        return null;
    }

    @Override
    public String getRace() {
        return null;
    }
}

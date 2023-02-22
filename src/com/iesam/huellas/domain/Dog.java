package com.iesam.huellas.domain;

public class Dog implements Pet {

    public Boolean friedly;

    public Boolean getFriedly() {
        return friedly;
    }

    public void setFriedly(Boolean friedly) {
        this.friedly = friedly;
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

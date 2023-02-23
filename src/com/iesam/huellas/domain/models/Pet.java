package com.iesam.huellas.domain.models;

public interface Pet {
    Integer id = null;
    String name = null;
    String dateBirth = null;
    String gender = null;
    String race = null;

    public default String getName(){
        return name;
    }
    public default Integer getId(){
        return id;
    }
    public default String getDateBirth(){
        return dateBirth;
    }
    public default String getGender(){
        return gender;
    }
    public default String getRace(){
        return race;
    }

}

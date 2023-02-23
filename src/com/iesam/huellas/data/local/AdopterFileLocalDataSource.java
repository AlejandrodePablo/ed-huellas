package com.iesam.huellas.data.local;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iesam.huellas.domain.models.Adopter;
import com.iesam.huellas.domain.models.Cat;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class AdopterFileLocalDataSource {
    private static AdopterFileLocalDataSource instance = null;

    private String nameFile = "adopter.txt";

    private Gson gson = new Gson();

    private final Type typeAlumnList = new TypeToken<ArrayList<Adopter>>() {
    }.getType();

    private AdopterFileLocalDataSource() {
    }

    public void save(Adopter adopter) {
        List<Adopter> adopters = findAll();
        adopters.add((Adopter) adopter);
        saveToFile((List<Adopter>) adopter);
    }

    public void saveList(List<Adopter> adopters) {
        saveToFile(adopters);
    }

    private void saveToFile(List<Adopter> adopters) {
        try {
            FileWriter myWriter = new FileWriter(nameFile);
            myWriter.write(gson.toJson(adopters));
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la información.");
            e.printStackTrace();
        }
    }


    public Adopter findById(Integer adopterId) {
        List<Adopter> adopters = findAll();
        for (Adopter adopter : adopters) {
            if (Objects.equals(adopter.getId(), adopterId)) {
                return adopter;
            }
        }
        return null;
    }

    public List<Adopter> findAll() {
        try {
            File myObj = new File(nameFile);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                myReader.close();
                return gson.fromJson(data, typeAlumnList);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ha ocurrido un error al obtener el listado.");
            e.printStackTrace();
        }
        return new ArrayList<Adopter>();
    }

    public static AdopterFileLocalDataSource getInstance() {
        if (instance == null) {
            instance = new AdopterFileLocalDataSource();
        }
        return instance;
    }
}

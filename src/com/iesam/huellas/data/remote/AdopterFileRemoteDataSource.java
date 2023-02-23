package com.iesam.huellas.data.remote;

import com.iesam.huellas.data.local.AdopterFileLocalDataSource;
import com.iesam.huellas.domain.AdopterRepository;
import com.iesam.huellas.domain.models.Adopter;

import java.util.List;

public class AdopterFileRemoteDataSource implements AdopterRepository {

    private AdopterFileLocalDataSource localDataSource = AdopterFileLocalDataSource.getInstance();

    @Override
    public void save(Adopter adopter) {

    }

    public List<Adopter> getAll(){
        return localDataSource.findAll();
    }
}

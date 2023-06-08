package com.example.geto.service;

import com.example.geto.entity.Dweller;

import java.util.List;

public interface DwellerService {

    //add dweller
    Dweller addDweller(Dweller dweller);

    //get all dweller
    List<Dweller> getAllDweller();

    //get dweller by id
    Dweller getDwellerById(Long id);

    //update
    Dweller updateDweller(Long id,Dweller dweller);

    //delete
    void deleteDweller(Long id);
}

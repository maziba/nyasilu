package com.example.geto.servicepp;

import com.example.geto.entity.Dweller;
import com.example.geto.repository.DwellerRepository;
import com.example.geto.service.DwellerService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DwellerServicepp implements DwellerService {

    private DwellerRepository dwellerRepository;

    public DwellerServicepp(DwellerRepository dwellerRepository) {
        this.dwellerRepository = dwellerRepository;
    }

    @Override
    public Dweller addDweller(Dweller dweller) {
        return dwellerRepository.save(dweller);
    }

    @Override
    public List<Dweller> getAllDweller() {
        return dwellerRepository.findAll();
    }

    @Override
    public Dweller getDwellerById(Long id) {
        Dweller dweller = dwellerRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Not Found"));
        return dweller;
    }

    @Override
    public Dweller updateDweller(Long id, Dweller dweller) {
        Dweller dweller1 =dwellerRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Not Found"));

        dweller1.setDwellerID(dweller.getDwellerID());
        dweller1.setDwellerName(dweller.getDwellerName());
        dweller1.setContact(dweller.getContact());
        dweller1.setPayment(dweller.getPayment());
        dweller1.setRoomNo(dweller.getRoomNo());

        Dweller updateDweller = dwellerRepository.save(dweller1);
        return dweller1;
    }

    @Override
    public void deleteDweller(Long id) {
         Dweller dweller = dwellerRepository.findById(id)
                 .orElseThrow(()->new RuntimeException("Not Found"));
         dwellerRepository.delete(dweller);
    }
}

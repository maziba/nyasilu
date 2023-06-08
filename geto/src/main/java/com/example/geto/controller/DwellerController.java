package com.example.geto.controller;

import com.example.geto.entity.Dweller;
import com.example.geto.service.DwellerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mageni/limbu")
public class DwellerController {

    private DwellerService dwellerService;

    public DwellerController(DwellerService dwellerService) {
        this.dwellerService = dwellerService;
    }

    //add dweller
    @PostMapping
    public ResponseEntity<Dweller> addDweller(@RequestBody Dweller dweller){
        return new ResponseEntity<>(dwellerService.addDweller(dweller), HttpStatus.CREATED);
    }
    //get all dweller
    @GetMapping
    public List<Dweller> getAllDweller(){
        return dwellerService.getAllDweller();
    }
    //get dweller by id
    @GetMapping("{id}")
    public ResponseEntity<Dweller> getDwellerById(@PathVariable Long id){
        return new ResponseEntity<>(dwellerService.getDwellerById(id),HttpStatus.OK);
    }
    //update
    @PutMapping("{id}")
    public ResponseEntity<Dweller> updateDweller(@PathVariable Long id,@RequestBody Dweller dweller){
        return new ResponseEntity<>(dwellerService.updateDweller(id, dweller),HttpStatus.OK);
    }
    //delete
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteDweller(@PathVariable Long id){
        dwellerService.deleteDweller(id);
        return new ResponseEntity<>("Deleted",HttpStatus.OK);

    }
}

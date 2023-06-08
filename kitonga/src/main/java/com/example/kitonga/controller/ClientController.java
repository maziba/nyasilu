package com.example.kitonga.controller;

import com.example.kitonga.entity.Client;
import com.example.kitonga.repository.ClientRepository;
import com.example.kitonga.service.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mama/client")
public class ClientController {

    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    //create
    @PostMapping
    public ResponseEntity<Client> addClient(@RequestBody Client client){
        return new ResponseEntity<>(clientService.addClient(client), HttpStatus.CREATED);
    }
    //get all client
    @GetMapping
     public List<Client> getAllClient(){
        return clientService.getAllClient();
    }
    //get by id
    @GetMapping("{id}")
    public ResponseEntity<Client> getClientById(@PathVariable Long id){
        return new ResponseEntity<>(clientService.getClientById(id),HttpStatus.OK);
    }
    //update
    @PutMapping("{id}")
    public ResponseEntity<Client> updateClient(@PathVariable Long id, @RequestBody Client client){
        return new ResponseEntity<>(clientService.updateClient(client, id), HttpStatus.OK);
    }
    //delete
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteClient(@PathVariable Long id){
        clientService.deleteClient(id);
        return new ResponseEntity<>("Deleted",HttpStatus.OK);
    }
}

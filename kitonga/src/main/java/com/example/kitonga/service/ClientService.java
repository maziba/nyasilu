package com.example.kitonga.service;

import com.example.kitonga.entity.Client;

import java.util.List;

public interface ClientService {

    //add client
    Client addClient(Client client);

    //get all client
    List<Client> getAllClient();

    //get client by id
    Client getClientById(Long id);

    //update
    Client updateClient(Client client, Long id);

    //delete
    void deleteClient(Long id);
}

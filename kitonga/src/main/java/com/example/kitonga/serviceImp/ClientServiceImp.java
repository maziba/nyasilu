package com.example.kitonga.serviceImp;

import com.example.kitonga.entity.Client;
import com.example.kitonga.repository.ClientRepository;
import com.example.kitonga.service.ClientService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClientServiceImp implements ClientService {

    private ClientRepository clientRepository;

    public ClientServiceImp(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> getAllClient() {
        return clientRepository.findAll();
    }

    @Override
    public Client getClientById(Long id) {
        Client client = clientRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Not Found"));
        return client;
    }

    @Override
    public Client updateClient(Client client, Long id) {
        Client client1 = clientRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Not Found"));

        client1.setClientID(client.getClientID());
        client1.setClientName(client.getClientName());
        client1.setEmail(client.getEmail());
        client1.setClientAddress(client.getClientAddress());
        client1.setContacts(client.getContacts());

        Client updateClient = clientRepository.save(client1);
        return updateClient;
    }

    @Override
    public void deleteClient(Long id) {
        Client client = clientRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Not Found"));
        clientRepository.delete(client);

    }
}

package com.CursoJava.projetJava.service;

import com.CursoJava.projetJava.domain.Client;
import com.CursoJava.projetJava.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public Iterable<Client> getAllClients()
    {
        return (List<Client>) clientRepository.findAll();
    }
    public void addClient(Client newClient)
    {
        clientRepository.save(newClient);
    }

    public void delelteClient(Long id)
    {
        clientRepository.delete(id);
    }

    public void updateClient(Client updateClient)
    {
        clientRepository.save(updateClient);
    }
    public Client getClienteById(Long id)
    {
        return clientRepository.findOne(id);
    }
}

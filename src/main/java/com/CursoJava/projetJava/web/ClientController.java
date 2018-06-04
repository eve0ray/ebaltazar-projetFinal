package com.CursoJava.projetJava.web;

import com.CursoJava.projetJava.domain.Client;
import com.CursoJava.projetJava.service.ClientService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")
public class ClientController {
    @Autowired
    ClientService clientService;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Client> getAllClients(){

        return clientService.getAllClients();

    }

    @RequestMapping(method = RequestMethod.POST)
    public void addClient(@RequestBody Client newClient)
    {
        clientService.addClient(newClient);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteClientByRequ(@RequestBody Client client)
    {
        clientService.delelteClient(client.getId());
    }

    @RequestMapping(method = RequestMethod.PATCH)
    public void updateClient(@RequestBody Client updateClient)
    {
        clientService.updateClient(updateClient);
    }
}

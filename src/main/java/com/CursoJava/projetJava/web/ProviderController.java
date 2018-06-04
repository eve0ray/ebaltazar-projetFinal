package com.CursoJava.projetJava.web;

import com.CursoJava.projetJava.domain.Provider;
import com.CursoJava.projetJava.service.ProviderService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/providers")
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")
public class ProviderController
{
    @Autowired
    ProviderService providerService;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Provider> getAllProviders(){

        return providerService.getAllProviders();

    }

    @RequestMapping(method = RequestMethod.POST)
    public void addProvider(@RequestBody Provider newProvider)
    {
        providerService.addProvider(newProvider);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteProviderByRequ(@RequestBody Provider provider)
    {
        providerService.delelteProvider(provider.getId());
    }

    @RequestMapping(method = RequestMethod.PATCH)
    public void updateProvider(@RequestBody Provider updateProvider)
    {
        providerService.updateProvider(updateProvider);
    }
}

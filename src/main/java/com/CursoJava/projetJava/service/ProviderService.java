package com.CursoJava.projetJava.service;

import com.CursoJava.projetJava.domain.Provider;
import com.CursoJava.projetJava.repository.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderService {
    @Autowired
    private ProviderRepository providerRepository;

    public Iterable<Provider> getAllProviders()
    {
        return (List<Provider>) providerRepository.findAll();
    }
    public void addProvider(Provider newProvider)
    {
        providerRepository.save(newProvider);
    }

    public void delelteProvider(Long id)
    {
        providerRepository.delete(id);
    }

    public void updateProvider(Provider updateProvider)
    {
        providerRepository.save(updateProvider);
    }
    public Provider getProviderById(Long id)
    {
        return providerRepository.findOne(id);
    }
}

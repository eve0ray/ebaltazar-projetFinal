package com.CursoJava.projetJava.repository;

import com.CursoJava.projetJava.domain.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProviderRepository extends JpaRepository<Provider, Long> {
    Provider getProviderById(Long id);
}

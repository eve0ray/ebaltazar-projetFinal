package com.CursoJava.projetJava.repository;

import com.CursoJava.projetJava.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}

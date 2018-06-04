package com.CursoJava.projetJava.repository;

import com.CursoJava.projetJava.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
//Crud
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category getCategoryById(Long id);
}


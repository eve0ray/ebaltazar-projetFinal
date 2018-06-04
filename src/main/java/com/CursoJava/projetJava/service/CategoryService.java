package com.CursoJava.projetJava.service;

import com.CursoJava.projetJava.domain.Category;
import com.CursoJava.projetJava.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public Iterable<Category> getAllCategories()
    {
        return (List<Category>) categoryRepository.findAll();
    }
    public void addCategory(Category newCategory)
    {
        categoryRepository.save(newCategory);
    }

    public void delelteCategory(Long id)
    {
        categoryRepository.delete(id);
    }

    public void updateCategory(Category updateStudent)
    {
        categoryRepository.save(updateStudent);
    }
    public Category getCategoryById(Long id)
    {
        return categoryRepository.findOne(id);
    }
}

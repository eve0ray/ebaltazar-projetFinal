package com.CursoJava.projetJava.web;

import com.CursoJava.projetJava.domain.Category;
import com.CursoJava.projetJava.service.CategoryService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Category> getAllCategories(){

        return categoryService.getAllCategories();

    }

    @RequestMapping(method = RequestMethod.POST)
    public void addCategory(@RequestBody Category newCategory)
    {
        categoryService.addCategory(newCategory);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteCategoryByRequ(@RequestBody Category category)
    {
        categoryService.delelteCategory(category.getId());
    }

    @RequestMapping(method = RequestMethod.PATCH)
    public void updateCategory(@RequestBody Category updateCategory)
    {
        categoryService.updateCategory(updateCategory);
    }
}

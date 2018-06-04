package com.CursoJava.projetJava.service;

import com.CursoJava.projetJava.domain.Category;
import com.CursoJava.projetJava.domain.Product;
import com.CursoJava.projetJava.domain.Provider;
import com.CursoJava.projetJava.repository.CategoryRepository;
import com.CursoJava.projetJava.repository.ProductRepository;
import com.CursoJava.projetJava.repository.ProviderRepository;
import com.CursoJava.projetJava.web.ProductController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ProviderRepository providerRepository;


    public Iterable<Product> getAllProducts()
    {
        return productRepository.findAll();
    }
    /*
    public void addProduct(Long id_cat, Long id_prov)
    {
        Product newProduct = new Product();
        Category category= categoryRepository.getCategoryById(id_cat);
        Provider provider= providerRepository.getProviderById(id_prov);
        newProduct.setCategory(category);
        newProduct.setProvider(provider);
        productRepository.save(newProduct);
    }*/
    public void addProduct(ProductController.ProductRequestDTO productDTO){
        Product newProduct = new Product();
        Category newCategory = categoryRepository.findOne(productDTO.getCategoryId());
        Provider newProvider = providerRepository.findOne(productDTO.getProviderId());

        newProduct.setCategory(newCategory);
        newProduct.setProvider(newProvider);
        newProduct.setName_pro(productDTO.getName_pro());
        newProduct.setPrice_pro(productDTO.getPrice_pro());
        newProduct.setDescription_pro(productDTO.getDescription_pro());

        productRepository.save(newProduct);
    }
}

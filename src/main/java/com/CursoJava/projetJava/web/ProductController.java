package com.CursoJava.projetJava.web;

import com.CursoJava.projetJava.domain.Product;
import com.CursoJava.projetJava.service.ProductService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")
public class ProductController
{
    @Autowired
    ProductService productService;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Product> getAllProduct(){

        return productService.getAllProducts();

    }
    /*
    @RequestMapping(method = RequestMethod.POST)
    public void addProduct(@RequestBody Product newProduct)
    {
        productService.addProduct(newProduct.getCategory().getId(),newProduct.getProvider().getId());
    }*/

    @RequestMapping(method = RequestMethod.POST)
    public void addSubscription(@RequestBody ProductRequestDTO product){
        productService.addProduct(product);
    }

    ////////////////////////////////
    public static class ProductRequestDTO
    {
        private Long providerId;
        private Long categoryId;
        private String name_pro;
        private Long price_pro;
        private String description_pro;

        public Long getProviderId() {
            return providerId;
        }

        public void setProviderId(Long providerId) {
            this.providerId = providerId;
        }

        public Long getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
        }

        public String getName_pro() {
            return name_pro;
        }

        public void setName_pro(String name_pro) {
            this.name_pro = name_pro;
        }

        public Long getPrice_pro() {
            return price_pro;
        }

        public void setPrice_pro(Long price_pro) {
            this.price_pro = price_pro;
        }

        public String getDescription_pro() {
            return description_pro;
        }

        public void setDescription_pro(String description_pro) {
            this.description_pro = description_pro;
        }
    }
}

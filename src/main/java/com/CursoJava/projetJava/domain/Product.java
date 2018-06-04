package com.CursoJava.projetJava.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id_pro;
    private String name_pro;
    private Long price_pro;
    private String description_pro;
    @ManyToOne
    private Category category;
    @ManyToOne
    private Provider provider;
    //private Set<Client> clients;
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            },
            mappedBy = "products")
    private Set<Client> clients = new HashSet<>();

    public Product()
    {

    }

    public Long getId_pro() {
        return id_pro;
    }

    public void setId_pro(Long id_pro) {
        this.id_pro = id_pro;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }
}

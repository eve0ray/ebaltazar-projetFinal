package com.CursoJava.projetJava.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name_cli;
    private String lastName_cli;
    private Long ci_cli;
    private Long phone_cli;
    private String address_cli;
    //private Set<Product> products;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(name = "client_products",
            joinColumns = { @JoinColumn(name = "cliente_id") },
            inverseJoinColumns = { @JoinColumn(name = "product_id") })
    private Set<Product> products = new HashSet<>();


    public Client()
    {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName_cli() {
        return name_cli;
    }

    public void setName_cli(String name_cli) {
        this.name_cli = name_cli;
    }

    public String getLastName_cli() {
        return lastName_cli;
    }

    public void setLastName_cli(String lastName_cli) {
        this.lastName_cli = lastName_cli;
    }

    public Long getCi_cli() {
        return ci_cli;
    }

    public void setCi_cli(Long ci_cli) {
        this.ci_cli = ci_cli;
    }

    public Long getPhone_cli() {
        return phone_cli;
    }

    public void setPhone_cli(Long phone_cli) {
        this.phone_cli = phone_cli;
    }

    public String getAddress_cli() {
        return address_cli;
    }

    public void setAddress_cli(String address_cli) {
        this.address_cli = address_cli;
    }
}

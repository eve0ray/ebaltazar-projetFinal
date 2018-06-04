package com.CursoJava.projetJava.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Provider {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name_prov;
    private String lasName_prov;
    private Long nit_prov;
    private Long phone_prov;
    private String address_prov;

    public Provider()
    {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName_prov() {
        return name_prov;
    }

    public void setName_prov(String name_prov) {
        this.name_prov = name_prov;
    }

    public String getLasName_prov() {
        return lasName_prov;
    }

    public void setLasName_prov(String lasName_prov) {
        this.lasName_prov = lasName_prov;
    }

    public Long getNit_prov() {
        return nit_prov;
    }

    public void setNit_prov(Long nit_prov) {
        this.nit_prov = nit_prov;
    }

    public Long getPhone_prov() {
        return phone_prov;
    }

    public void setPhone_prov(Long phone_prov) {
        this.phone_prov = phone_prov;
    }

    public String getAddress_prov() {
        return address_prov;
    }

    public void setAddress_prov(String address_prov) {
        this.address_prov = address_prov;
    }
}

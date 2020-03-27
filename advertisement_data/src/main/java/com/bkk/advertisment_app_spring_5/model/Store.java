package com.bkk.advertisment_app_spring_5.model;

import java.util.HashSet;
import java.util.Set;

public class Store extends BaseEntity {

    private String name;
    private String adress;
    private String zip;
    private String City;
    private String manager;
    private Set<Product> products = new HashSet<>();

    public Store(String name, String adress, String zip, String city, String manager) {
        this.name = name;
        this.adress = adress;
        this.zip = zip;
        City = city;
        this.manager = manager;
    }

    public Store() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}

package com.bkk.advertisment_app_spring_5.model;

import java.util.HashSet;
import java.util.Set;

public class Manufacturer extends BaseEntity{
    private String name;
    private String adressLine;
    private String zipcode;
    private String city;
    private Set<Product> products = new HashSet<>();

    public Manufacturer(String name, String adressLine, String zipcode, String city) {
        this.name = name;
        this.adressLine = adressLine;
        this.zipcode = zipcode;
        this.city = city;
    }

    public Manufacturer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdressLine() {
        return adressLine;
    }

    public void setAdressLine(String adressLine) {
        this.adressLine = adressLine;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}

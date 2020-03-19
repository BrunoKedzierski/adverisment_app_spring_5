package com.bkk.advertisment_app_spring_5.model;

import java.util.HashSet;
import java.util.Set;

public class User {
    private String username;
    private String firstName;
    private String lastName;
    private String adressLine;
    private String zipcode;
    private String city;
    private Set<Post> posts = new HashSet<>();


    public User(String username, String firstName, String lastName, String adressLine, String zipcode, String city) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.adressLine = adressLine;
        this.zipcode = zipcode;
        this.city = city;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
}

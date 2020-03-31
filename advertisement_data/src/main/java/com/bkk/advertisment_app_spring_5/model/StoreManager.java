package com.bkk.advertisment_app_spring_5.model;

import java.time.LocalDate;

public class StoreManager extends BaseEntity {
    String Name;
    String Surname;
    LocalDate hired;
    LocalDate contractExpires;

    public StoreManager(String name, String surname, LocalDate hired, LocalDate contractExpires) {
        Name = name;
        Surname = surname;
        this.hired = hired;
        this.contractExpires = contractExpires;
    }

    public LocalDate getHired() {
        return hired;
    }

    public void setHired(LocalDate hired) {
        this.hired = hired;
    }

    public LocalDate getContractExpires() {
        return contractExpires;
    }

    public void setContractExpires(LocalDate contractExpires) {
        this.contractExpires = contractExpires;
    }

    public StoreManager() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }
}

package com.bkk.advertisment_app_spring_5.model;

public class Product extends BaseEntity{

    private String Name;
    private Manufacturer manufacturer;
    private int quantity;
    private double price;
    private Category category;

    public Product(String name, Manufacturer manufacturer, int quantity, double price, Category category) {
        Name = name;
        this.manufacturer = manufacturer;
        this.quantity = quantity;
        this.price = price;
        this.category = category;
    }

    public Product() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}

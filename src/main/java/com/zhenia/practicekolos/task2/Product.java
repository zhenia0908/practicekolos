package com.zhenia.practicekolos.task2;

public class Product {
    private double price;
    private String name;
    private String kategory;

    public String getKategory() {
        return kategory;
    }

    public void setKategory(String kategory) {
        this.kategory = kategory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product(double price, String name, String kategory) {
        this.price = price;
        this.name = name;
        this.kategory = kategory;
    }
    public Product(){}
}

package com.example.springboot;

import lombok.Data;



@Data
public class Product {

    private int id;
    private String title;
    private int cost;

    public Product(int id, String title, int cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    public Product(String title) {
        this.title = title;
    }
}

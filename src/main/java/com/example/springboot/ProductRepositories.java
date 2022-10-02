package com.example.springboot;

import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ProductRepositories {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(1, "Репа", 25),
            new Product(2, "Тыква", 34),
            new Product(3, "Редька", 12),
            new Product(4, "Лимон", 78)

    ));


    public Product findOneById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;

    }


}

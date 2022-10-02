package com.example.springboot;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepositories productRepositories;


    public Product getProductById(int id){
        return productRepositories.findOneById(id);
    }

}

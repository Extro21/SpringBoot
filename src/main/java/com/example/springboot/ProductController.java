package com.example.springboot;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping({"/product"})
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;


    @RequestMapping(
            path = {"/showProductById"}
    )
    @ResponseBody
    public Product showStudentById(@RequestParam int id) {
        Product product = this.productService.getProductById(id);
        if(product == null){
            throw new IllegalArgumentException();
        }
        return product;
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public String handle(IllegalArgumentException e){
        log.error(e.getMessage());
        return "Нет такого продукта";
    }


}

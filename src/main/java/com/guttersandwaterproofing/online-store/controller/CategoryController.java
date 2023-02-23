package com.ecommerce.OnlineStore.controller;

import com.ecommerce.OnlineStore.model.Category;
import com.ecommerce.OnlineStore.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    @PostMapping("/create")
    public String createCategory(@RequestBody Category category){
        categoryService.createCategory(category);
        return "success";

    }

    @GetMapping
    public String test() {
        return "test response";
    }
}

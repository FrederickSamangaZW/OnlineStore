package com.ecommerce.OnlineStore.service;

import com.ecommerce.OnlineStore.model.Category;
import com.ecommerce.OnlineStore.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    CategoryRepo categoryRepo;
    public void createCategory(Category category){
        categoryRepo.save(category);
    }

}

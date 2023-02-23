package com.ecommerce.OnlineStore.repository;

import com.ecommerce.OnlineStore.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  CategoryRepo extends JpaRepository<Category, Integer> {
}

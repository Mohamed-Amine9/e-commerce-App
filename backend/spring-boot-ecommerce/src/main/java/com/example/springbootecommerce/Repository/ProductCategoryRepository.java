package com.example.springbootecommerce.Repository;

import com.example.springbootecommerce.Entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Long> {
}

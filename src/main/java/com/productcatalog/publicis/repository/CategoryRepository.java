package com.productcatalog.publicis.repository;

import com.productcatalog.publicis.entitiy.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

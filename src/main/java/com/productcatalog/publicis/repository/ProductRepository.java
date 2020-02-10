package com.productcatalog.publicis.repository;

import com.productcatalog.publicis.entitiy.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

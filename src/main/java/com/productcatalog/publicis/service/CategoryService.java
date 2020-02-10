package com.productcatalog.publicis.service;

import com.productcatalog.publicis.entitiy.Category;
import com.productcatalog.publicis.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public void createCategory(Category category) {
        categoryRepository.save(category);
    }

    public void createCategorys(List<Category> categorys) {
        categoryRepository.saveAll(categorys);
    }

    public Category getCategory(Long categoryId) {
        return categoryRepository.findById(categoryId).get();
    }

    public List<Category> getAllCategorys() {
        return categoryRepository.findAll();
    }

    public void updateCategory(Category category) {
        categoryRepository.save(category);
    }
}

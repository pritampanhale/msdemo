package com.productcatalog.publicis.service;

import com.productcatalog.publicis.entitiy.Brand;
import com.productcatalog.publicis.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class BrandService {

    @Autowired
    private BrandRepository brandRepository;

    public void createBrand(Brand brand) {
        brandRepository.save(brand);
    }

    public void createBrands(List<Brand> brands) {
        brandRepository.saveAll(brands);
    }

    public Brand getBrand(Long brandId) {
        return brandRepository.findById(brandId).get();
    }

    public List<Brand> getAllBrands() {
        return brandRepository.findAll();
    }

    public void updateBrand(Brand brand) {
        brandRepository.save(brand);
    }
}

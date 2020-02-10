package com.productcatalog.publicis.service;

import com.productcatalog.publicis.entitiy.Product;
import com.productcatalog.publicis.repository.GeneralRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneralService {

    @Autowired
    private GeneralRepository generalRepository;

    public List<Product> getProductsByBrands(){
        return generalRepository.getByBrands();
    }

    public List<Product> getProductsByPrice(){
        return generalRepository.getByPrice();
    }

    public List<Product> getProductsByColour(){
        return generalRepository.getByColour();
    }

    public List<Product> getProductsBySize(){
        return generalRepository.getBySize();
    }

    public List<Product> getProductsByQty(){
        return generalRepository.getByQty();
    }
}

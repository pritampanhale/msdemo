package com.productcatalog.publicis.controller;

import com.productcatalog.publicis.entitiy.Product;
import com.productcatalog.publicis.service.GeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/groupBy")
public class GeneralController {

    @Autowired
    private GeneralService generalService;

    @RequestMapping("/brand")
    public List<Product> groupByBrand() {
        return generalService.getProductsByBrands();
    }

    @RequestMapping("/price")
    public List<Product> groupByPrice() {
        return generalService.getProductsByPrice();
    }

    @RequestMapping("/colour")
    public List<Product> groupByColour() {
        return generalService.getProductsByColour();
    }

    @RequestMapping("/size")
    public List<Product> groupBySize() {
        return generalService.getProductsBySize();
    }

    @RequestMapping("/qty")
    public List<Product> groupByQty() {
        return generalService.getProductsByQty();
    }

}

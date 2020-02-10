package com.productcatalog.publicis.controller;

import com.productcatalog.publicis.constants.SizeEnum;
import com.productcatalog.publicis.entitiy.Brand;
import com.productcatalog.publicis.entitiy.Category;
import com.productcatalog.publicis.entitiy.Product;
import com.productcatalog.publicis.service.GeneralService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

public class GeneralControllerTest {

    @Mock
    private GeneralService generalService;

    @InjectMocks
    private GeneralController generalController;

    @BeforeEach
    public void beforeEachTest(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGroupByByBrand(){
        // Given
        List<Product> productList = getProducts();

        Mockito.when(generalService.getProductsByBrands()).thenReturn(productList);
        List<Product> products = generalController.groupByBrand();

        //Expected
        Mockito.verify(generalService, Mockito.times(1)).getProductsByBrands();
        Assertions.assertEquals(products.get(0).getBrand().getName(), "TestBrand");
        Assertions.assertEquals(products.get(0).getCategory().getType(), "TestCat");
        Assertions.assertEquals(products.get(0).getAvailableQty(), 90);
        Assertions.assertEquals(products.get(0).getSize(), SizeEnum.LARGE);
        Assertions.assertEquals(products.get(0).getColour(), "Blue");
        Assertions.assertEquals(products.get(0).getName(), "TestName");
    }

    @Test
    public void testGroupByByColour(){
        // Given
        List<Product> productList = getProducts();

        Mockito.when(generalService.getProductsByColour()).thenReturn(productList);
        List<Product> products = generalController.groupByColour();

        //Expected
        Mockito.verify(generalService, Mockito.times(1)).getProductsByColour();
        Assertions.assertEquals(products.get(0).getBrand().getName(), "TestBrand");
        Assertions.assertEquals(products.get(0).getCategory().getType(), "TestCat");
        Assertions.assertEquals(products.get(0).getAvailableQty(), 90);
        Assertions.assertEquals(products.get(0).getSize(), SizeEnum.LARGE);
        Assertions.assertEquals(products.get(0).getColour(), "Blue");
        Assertions.assertEquals(products.get(0).getName(), "TestName");
    }

    @Test
    public void testGroupByByPrice(){
        // Given
        List<Product> productList = getProducts();

        Mockito.when(generalService.getProductsByPrice()).thenReturn(productList);
        List<Product> products = generalController.groupByPrice();

        //Expected
        Mockito.verify(generalService, Mockito.times(1)).getProductsByPrice();
        Assertions.assertEquals(products.get(0).getBrand().getName(), "TestBrand");
        Assertions.assertEquals(products.get(0).getCategory().getType(), "TestCat");
        Assertions.assertEquals(products.get(0).getAvailableQty(), 90);
        Assertions.assertEquals(products.get(0).getSize(), SizeEnum.LARGE);
        Assertions.assertEquals(products.get(0).getColour(), "Blue");
        Assertions.assertEquals(products.get(0).getName(), "TestName");
    }

    @Test
    public void testGroupByByQty(){
        // Given
        List<Product> productList = getProducts();

        Mockito.when(generalService.getProductsByQty()).thenReturn(productList);
        List<Product> products = generalController.groupByQty();

        //Expected
        Mockito.verify(generalService, Mockito.times(1)).getProductsByQty();
        Assertions.assertEquals(products.get(0).getBrand().getName(), "TestBrand");
        Assertions.assertEquals(products.get(0).getCategory().getType(), "TestCat");
        Assertions.assertEquals(products.get(0).getAvailableQty(), 90);
        Assertions.assertEquals(products.get(0).getSize(), SizeEnum.LARGE);
        Assertions.assertEquals(products.get(0).getColour(), "Blue");
        Assertions.assertEquals(products.get(0).getName(), "TestName");
    }

    @Test
    public void testGroupByBySize(){
        // Given
        List<Product> productList = getProducts();

        Mockito.when(generalService.getProductsBySize()).thenReturn(productList);
        List<Product> products = generalController.groupBySize();

        //Expected
        Mockito.verify(generalService, Mockito.times(1)).getProductsBySize();
        Assertions.assertEquals(products.get(0).getBrand().getName(), "TestBrand");
        Assertions.assertEquals(products.get(0).getCategory().getType(), "TestCat");
        Assertions.assertEquals(products.get(0).getAvailableQty(), 90);
        Assertions.assertEquals(products.get(0).getSize(), SizeEnum.LARGE);
        Assertions.assertEquals(products.get(0).getColour(), "Blue");
        Assertions.assertEquals(products.get(0).getName(), "TestName");
    }

    private List<Product> getProducts() {
        List<Product> productList = new ArrayList<>();
        Product product = new Product();
        Brand brand = new Brand();
        brand.setName("TestBrand");
        product.setBrand(brand);
        Category category = new Category();
        category.setType("TestCat");
        product.setCategory(category);
        product.setAvailableQty(90);
        product.setSize(SizeEnum.LARGE);
        product.setColour("Blue");
        product.setName("TestName");

        productList.add(product);
        return productList;
    }
}

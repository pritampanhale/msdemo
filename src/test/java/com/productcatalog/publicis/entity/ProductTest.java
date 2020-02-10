package com.productcatalog.publicis.entity;

import com.productcatalog.publicis.constants.SizeEnum;
import com.productcatalog.publicis.entitiy.Brand;
import com.productcatalog.publicis.entitiy.Category;
import com.productcatalog.publicis.entitiy.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {

    @Test
    public void testProduct() {
        Product product = getProduct();
        Product product1 = getProduct();
        Assertions.assertEquals(product.getName(), "TestName");
        Assertions.assertEquals(product, product1);
        Assertions.assertEquals(product.hashCode(), product1.hashCode());
        Assertions.assertEquals("Product{productId=0, name='TestName', colour='Blue', price=null, size=LARGE, availableQty=90, category=Category{categoryId=0, type='TestCat'}, brand=Brand{brandId=0, name='TestBrand'}}", product.toString());

    }

    private Product getProduct() {
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

        return product;
    }
}



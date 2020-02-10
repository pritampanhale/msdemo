package com.productcatalog.publicis.entity;

import com.productcatalog.publicis.entitiy.Brand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BrandTest {

    @Test
    public void testBrand(){
        Brand brand = new Brand();
        brand.setName("name");
        brand.setBrandId(12L);

        Brand brand2 = new Brand();
        brand2.setName("name");
        brand2.setBrandId(12L);

        Assertions.assertEquals(brand.getName(),"name");
        Assertions.assertEquals(brand.getBrandId(),12L);
        Assertions.assertTrue(brand.equals(brand2));
        Assertions.assertEquals(brand.hashCode(), brand2.hashCode());
        Assertions.assertEquals("Brand{brandId=12, name='name'}", brand.toString());
    }
}

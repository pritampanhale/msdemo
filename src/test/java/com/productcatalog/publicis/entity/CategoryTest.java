package com.productcatalog.publicis.entity;

import com.productcatalog.publicis.entitiy.Category;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CategoryTest {

    @Test
    public void testCategory(){
        Category category = new Category();
        category.setType("type");
        category.setCategoryId(13L);

        Category category1 = new Category();
        category1.setType("type");
        category1.setCategoryId(13L);

        Assertions.assertEquals(category.getType(),"type");
        Assertions.assertEquals(category.getCategoryId(),13L);
        Assertions.assertTrue(category.equals(category1));
        Assertions.assertEquals(category.hashCode(), category1.hashCode());
        Assertions.assertEquals("Category{categoryId=13, type='type'}", category.toString());
    }
}

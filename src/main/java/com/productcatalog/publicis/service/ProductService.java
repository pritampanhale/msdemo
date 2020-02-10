package com.productcatalog.publicis.service;

import com.productcatalog.publicis.constants.SizeEnum;
import com.productcatalog.publicis.entitiy.Brand;
import com.productcatalog.publicis.entitiy.Category;
import com.productcatalog.publicis.entitiy.Product;
import com.productcatalog.publicis.repository.BrandRepository;
import com.productcatalog.publicis.repository.CategoryRepository;
import com.productcatalog.publicis.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private BrandRepository brandRepository;

    @Autowired
    private CategoryRepository categoryRepository;


    @PostConstruct
    public void createProductDummyData() {
        List<Brand> brands = new ArrayList<>();
        Brand brand = new Brand();
        brand.setName("Adidas");

        Brand brand1 = new Brand();
        brand1.setName("Puma");

        Brand brand2 = new Brand();
        brand2.setName("Pepe Jeans");

        Brand brand3 = new Brand();
        brand3.setName("Allen Solly");

        Brand brand4 = new Brand();
        brand4.setName("Raymond");

        brands.add(brand);
        brands.add(brand1);
        brands.add(brand2);
        brands.add(brand3);
        brands.add(brand4);

        brandRepository.saveAll(brands);

        Category category1 = new Category();
        category1.setType("Shirt");

        Category category2 = new Category();
        category2.setType("Trouser");

        Category category3 = new Category();
        category3.setType("Shorts");

        Category category4 = new Category();
        category4.setType("Jeans");

        Category category5 = new Category();
        category5.setType("Shoes");

        List<Category> categories = new ArrayList<>();
        categories.add(category1);
        categories.add(category2);
        categories.add(category3);
        categories.add(category4);
        categories.add(category5);

        categoryRepository.saveAll(categories);

        Map<String, Brand> brandMap = brandRepository.findAll()
                .stream()
                .collect(Collectors.toMap(Brand::getName, b -> b));
        Map<String, Category> categoryMap = categoryRepository.findAll()
                .stream()
                .collect(Collectors.toMap(Category::getType, c -> c));

        Product product1 = new Product();
        product1.setBrand(brandMap.get("Adidas"));
        product1.setCategory(categoryMap.get("Shoes"));
        product1.setName("Sport Shoes");
        product1.setColour("White");
        product1.setPrice(1200);
        product1.setSize(SizeEnum.LARGE);
        product1.setAvailableQty(40);


        Product product2 = new Product();
        product2.setBrand(brandMap.get("Puma"));
        product2.setCategory(categoryMap.get("Shoes"));
        product2.setName("Sport Shoes");
        product2.setColour("Grey");
        product2.setPrice(1300);
        product2.setSize(SizeEnum.XL);
        product2.setAvailableQty(35);

        Product product3 = new Product();
        product3.setBrand(brandMap.get("Allen Solly"));
        product3.setCategory(categoryMap.get("Jeans"));
        product3.setName("Stylish Jeans");
        product3.setColour("Blue");
        product3.setPrice(2000);
        product3.setSize(SizeEnum.MEDIUM);
        product3.setAvailableQty(100);

        Product product4 = new Product();
        product4.setBrand(brandMap.get("Pepe Jeans"));
        product4.setCategory(categoryMap.get("Jeans"));
        product4.setName("Stylish Jeans");
        product4.setColour("Black");
        product4.setPrice(2750);
        product4.setSize(SizeEnum.LARGE);
        product4.setAvailableQty(80);

        Product product5 = new Product();
        product5.setBrand(brandMap.get("Raymond"));
        product5.setCategory(categoryMap.get("Shorts"));
        product5.setName("Comfortable Shorts");
        product5.setColour("Black");
        product5.setPrice(700);
        product5.setSize(SizeEnum.XXL);
        product5.setAvailableQty(140);

        Product product6 = new Product();
        product6.setBrand(brandMap.get("Puma"));
        product6.setCategory(categoryMap.get("Shorts"));
        product6.setName("Comfortable Shorts");
        product6.setColour("Red");
        product6.setPrice(800);
        product6.setSize(SizeEnum.MEDIUM);
        product6.setAvailableQty(370);


        Product product7 = new Product();
        product7.setBrand(brandMap.get("Raymond"));
        product7.setCategory(categoryMap.get("Trouser"));
        product7.setName("Classy Trousers");
        product7.setColour("Black");
        product7.setPrice(1100);
        product7.setSize(SizeEnum.LARGE);
        product7.setAvailableQty(210);

        Product product8 = new Product();
        product8.setBrand(brandMap.get("Allen Solly"));
        product8.setCategory(categoryMap.get("Trouser"));
        product8.setName("Classy Trousers");
        product8.setColour("Grey");
        product8.setPrice(1450);
        product8.setSize(SizeEnum.XXL);
        product8.setAvailableQty(167);


        Product product9 = new Product();
        product9.setBrand(brandMap.get("Allen Solly"));
        product9.setCategory(categoryMap.get("Shirt"));
        product9.setName("Half Sleeve");
        product9.setColour("Blue");
        product9.setPrice(850);
        product9.setSize(SizeEnum.LARGE);
        product9.setAvailableQty(345);

        Product product10 = new Product();
        product10.setBrand(brandMap.get("Pepe Jeans"));
        product10.setCategory(categoryMap.get("Shirt"));
        product10.setName("Full Sleeve");
        product10.setColour("Black");
        product10.setPrice(1250);
        product10.setSize(SizeEnum.XL);
        product10.setAvailableQty(39);


        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);
        products.add(product9);
        products.add(product10);

        productRepository.saveAll(products);
    }

    public void createProduct(Product product) {
        productRepository.save(product);
    }

    public void createProducts(List<Product> products) {
        productRepository.saveAll(products);
    }

    public Product getProduct(Long productId) {
        return productRepository.findById(productId).get();
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public void updateProduct(Product product) {
        productRepository.save(product);
    }
}

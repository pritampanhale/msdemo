package com.productcatalog.publicis;

import com.productcatalog.publicis.entitiy.Brand;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SpringBootApplication
public class PublicisApplication {

    public static void main(String[] args) {
        SpringApplication.run(PublicisApplication.class, args);
    }
}

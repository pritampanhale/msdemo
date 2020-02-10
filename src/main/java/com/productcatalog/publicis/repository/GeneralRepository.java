package com.productcatalog.publicis.repository;

import com.productcatalog.publicis.entitiy.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class GeneralRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Product> getByBrands(){
        StringBuilder query = new StringBuilder();
        query.append("select P from Product P ")
        .append("join P.brand Brand ")
        .append("order by Brand.name");
        List<Product> resultList = entityManager.createQuery(query.toString(), Product.class).getResultList();
        return resultList;
    }

    public List<Product> getByPrice(){
        StringBuilder query = new StringBuilder();
        query.append("select P from Product P ")
                .append("order by P.price");
        List<Product> resultList = entityManager.createQuery(query.toString(), Product.class).getResultList();
        return resultList;
    }

    public List<Product> getByColour(){
        StringBuilder query = new StringBuilder();
        query.append("select P from Product P ")
                .append("order by P.colour");
        List<Product> resultList = entityManager.createQuery(query.toString(), Product.class).getResultList();
        return resultList;
    }

    public List<Product> getBySize(){
        StringBuilder query = new StringBuilder();
        query.append("select P from Product P ")
                .append("order by P.size");
        List<Product> resultList = entityManager.createQuery(query.toString(), Product.class).getResultList();
        return resultList;
    }

    public List<Product> getByQty(){
        StringBuilder query = new StringBuilder();
        query.append("select P from Product P ")
                .append("order by P.availableQty");
        List<Product> resultList = entityManager.createQuery(query.toString(), Product.class).getResultList();
        return resultList;
    }
}

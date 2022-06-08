package com.aptech.t2008mresfulwebservice.repository;

import com.aptech.t2008mresfulwebservice.entity.Product;

import java.util.List;

public interface ProductModel {

    Product save(Product product);

    Product update(Product product , int id);

    boolean delete(int id);

    List<Product> findAll();

    Product findById(int id);
}

package com.aptech.t2008mresfulwebservice.repository;

import com.aptech.t2008mresfulwebservice.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class InMemoryProductModel implements ProductModel {

    private static List<Product> products = new ArrayList<>();

    @Override
    public Product save(Product product) {
        products.add(product);
        return product;
    }

    @Override
    public Product update(Product product, int id) {
        int foundIndex = -1;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                foundIndex = i;
            }
        }
        if (foundIndex != -1) {
            products.get(foundIndex).setPrice(product.getPrice());
            products.get(foundIndex).setName(product.getName());
        }
        return products.get(foundIndex);
    }

    @Override
    public boolean delete(int id) {
        int foundIndex = -1;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                foundIndex = i;
            }
        }
        if (foundIndex != -1) {
            products.remove(foundIndex);
            return true;
        }
        return false;
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product findById(int id) {
        int foundIndex = -1;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                foundIndex = i;
            }
    }
    if(foundIndex !=-1) {
        return products.get(foundIndex);
    }
    return null;
}
}

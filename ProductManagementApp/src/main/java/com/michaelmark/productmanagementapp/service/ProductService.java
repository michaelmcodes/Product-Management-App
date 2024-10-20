package com.michaelmark.productmanagementapp.service;

import com.michaelmark.productmanagementapp.model.Product;
import com.michaelmark.productmanagementapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repo;

    public void saveProduct(Product product){
        repo.save(product);
    }
    public List<Product> searchProducts(Integer pid, String pname, String location, Integer quantity){

        Set<Product> products = new HashSet<>();

        if (pid != null) {
            products.addAll(repo.findByPid(pid));
        }
        if (pname != null && !pname.isEmpty()) {
            products.addAll(repo.findByPname(pname));
        }
        if (location != null && !location.isEmpty()) {
            products.addAll(repo.findByLocation(location));
        }
        if (quantity != null) {
            products.addAll(repo.findByQuantity(quantity));
        }

        if (products.isEmpty()) {
            return repo.findAll();
        }

        // Convert Set back to List for consistency
        return new ArrayList<>(products);
        }
}

package com.michaelmark.productmanagementapp.repository;

import com.michaelmark.productmanagementapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {


    List<Product> findByPid(Integer pid);

    List<Product> findByPname(String pname);

    List<Product> findByLocation(String location);

    List<Product> findByQuantity(Integer quantity);
}

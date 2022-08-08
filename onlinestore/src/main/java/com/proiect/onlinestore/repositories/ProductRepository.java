package com.proiect.onlinestore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proiect.onlinestore.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}

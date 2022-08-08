package com.proiect.onlinestore.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proiect.onlinestore.models.Product;
import com.proiect.onlinestore.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
    public List<Product> findAll() {
        return productRepository.findAll();
    }
    
    public Optional<Product> findById(int id) {
		return productRepository.findById(id);
	}
}

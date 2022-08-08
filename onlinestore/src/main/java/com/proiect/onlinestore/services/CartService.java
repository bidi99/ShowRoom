package com.proiect.onlinestore.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proiect.onlinestore.models.Cart;
import com.proiect.onlinestore.repositories.CartRepository;

@Service
public class CartService {

	@Autowired
	private CartRepository cartRepository;

	// Get All Orders
	public List<Cart> findAll() {
		return cartRepository.findAll();
	}

	//Get Orders By Id
	public Optional<Cart> findById(int id) {
		return cartRepository.findById(id);
	}

	//Save Order
	public void save(Cart cart) {
		cartRepository.save(cart);
	}

	//Delete Order
	public void delete(int id) {
		cartRepository.deleteById(id);
	}
}

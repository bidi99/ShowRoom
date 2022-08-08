package com.proiect.onlinestore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proiect.onlinestore.models.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

}

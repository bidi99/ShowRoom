package com.proiect.onlinestore.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.proiect.onlinestore.models.Cart;
import com.proiect.onlinestore.services.CartService;


@Controller
public class CartController {

	@Autowired
	private CartService cartService;

	@GetMapping("carts")
	public String findAll(Model model) {
		model.addAttribute("carts", cartService.findAll());
		return "cart";
	}

	@RequestMapping("carts/findById")
	@ResponseBody
	public Optional<Cart> findById(Integer id) {
		return cartService.findById(id);
	}

	// Add Order
	@PostMapping(value = "carts/addNew")
	public String addNew(Cart cart) {
		cartService.save(cart);
		return "redirect:/cart";
	}
	
	// Delete Order
	@RequestMapping(value="carts/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		cartService.delete(id);
		return "redirect:/cart";
	}
}

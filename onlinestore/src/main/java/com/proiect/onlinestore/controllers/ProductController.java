package com.proiect.onlinestore.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.proiect.onlinestore.models.Product;
import com.proiect.onlinestore.services.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("products")
	public String findAll(Model model) {
		model.addAttribute("products", productService.findAll());
		return "product";
	}
	
	@RequestMapping("products/findById")
	@ResponseBody
	public Optional<Product> findById(Integer id) {
		return productService.findById(id);
	}
}

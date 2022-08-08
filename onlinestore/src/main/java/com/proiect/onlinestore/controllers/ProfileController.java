package com.proiect.onlinestore.controllers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proiect.onlinestore.services.UserService;

@Controller
public class ProfileController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/profile")
	public String profile(Model model, Principal principal) {

		String un = principal.getName();
		model.addAttribute("users", userService.findByUsername(un));
		return "profile";
	}
}

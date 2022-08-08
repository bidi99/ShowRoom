package com.proiect.onlinestore.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.proiect.onlinestore.models.User;
import com.proiect.onlinestore.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private BCryptPasswordEncoder encoder;

	@Autowired
	private UserRepository userRepository;
	
	//return list of users
	public List<User> getUsers(){
		return userRepository.findAll();
	}
	
	//save new user
	public void save(User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		userRepository.save(user);
	}
	
	//get by id
	public Optional<User> findById(int id) {
		return userRepository.findById(id);
	}
	
	public User findByUsername(String un) {
		return userRepository.findByUsername(un);
	}
}

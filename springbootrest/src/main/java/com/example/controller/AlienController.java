package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.AlienRepository;
import com.example.model.Alien;

@RestController
public class AlienController {
	
	@Autowired
	AlienRepository repo;
	
	// Using JPA
	@GetMapping("alien/{id}")
	@ResponseBody
	public Optional<Alien> getAlienById(@PathVariable int id) {
		

		return repo.findById(id);
	}
	
	@GetMapping("aliens")
	public List<Alien> getAliens(){
		
		return (List<Alien>) repo.findAll();
	}
	

}

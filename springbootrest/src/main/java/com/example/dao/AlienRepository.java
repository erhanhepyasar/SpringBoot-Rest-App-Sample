package com.example.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Alien;

public interface AlienRepository extends CrudRepository<Alien, Integer> {

}

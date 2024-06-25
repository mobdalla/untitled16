package com.stars.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.stars.entities.StarsBrawl;
import com.stars.services.StarsBrawlSer;

@RestController
public class StarsBrawlRest {
	
	@Autowired
	private StarsBrawlSer service;
	
	@GetMapping("brawl")
	public List<StarsBrawl> getAllBrawl(){
		return service.getBrawls();
	}
	@GetMapping("brawl/{name}")
	public StarsBrawl getBrawlByNome(@PathVariable String name) {
		return service.getStarsByName(name);
	}

}

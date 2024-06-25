package com.stars.repos;


import org.springframework.data.jpa.repository.JpaRepository;

import com.stars.entities.StarsBrawl;

public interface StarsBrawlDAO extends JpaRepository<StarsBrawl, String> {
	
	StarsBrawl getByName(String nome);


}

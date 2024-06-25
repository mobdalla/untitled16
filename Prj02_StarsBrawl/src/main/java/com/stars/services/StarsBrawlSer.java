package com.stars.services;

import java.util.List;

import com.stars.entities.StarsBrawl;
import com.stars.repos.StarsBrawlDAO;

public interface StarsBrawlSer {
	
	List<StarsBrawl> getBrawls();
	StarsBrawl getStarsByName(String nome);

}

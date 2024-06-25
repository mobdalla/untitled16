package com.stars.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stars.entities.StarsBrawl;
import com.stars.repos.StarsBrawlDAO;
@Service
public class StarsBrawlSerIm implements StarsBrawlSer {

	@Autowired
	private StarsBrawlDAO dao;
	@Override
	public List<StarsBrawl> getBrawls() {
		// TODO Auto-generated method stub
		return dao.findAll() ;
	}

	@Override
	public StarsBrawl getStarsByName(String nome) {
		// TODO Auto-generated method stub
		return dao.getByName(nome);
	}

}

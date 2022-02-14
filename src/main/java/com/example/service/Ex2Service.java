package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Ex2;
import com.example.repository.Ex2Repository;

@Service
@Transactional
public class Ex2Service {
	
	@Autowired
	private Ex2Repository repository;
	
	public List<Ex2> findByPrice(Integer price){
		List<Ex2> list = repository.findByPrice(price);
		return list;
	}
	
	public List<Ex2> showAll(){
		List<Ex2> allList=repository.showAll();
		return allList;
	}

}

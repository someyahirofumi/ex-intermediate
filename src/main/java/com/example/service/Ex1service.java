package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Ex1Team;
import com.example.repository.Ex1TeamRepository;

@Service
@Transactional
public class Ex1service {
	
	@Autowired 
	private Ex1TeamRepository repository;

	public Ex1Team load(String teamName) {
		return repository.showDetail(teamName);
		
	}
	
	public List<Ex1Team> teamList(){
		List<Ex1Team> teamList= repository.showAll();
		return teamList;
	}

}

package com.example.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Ex1Team;
import com.example.service.Ex1service;

@Controller
@RequestMapping("")

public class Ex1Controller {
	
	@Autowired
	private Ex1service service;
	
	@RequestMapping("")
	public String index(Model model) {
		List<Ex1Team> team = new ArrayList<>();
		team = service.teamList();
		model.addAttribute("team",team);
		
		
		return "showList";
	}
	
	@RequestMapping("showdetail")
	public String showDetail(String teamName,Model model) {
		Ex1Team team = service.load(teamName);
		model.addAttribute("teamdetail",team);
		return "showdetail";
		
	}

}

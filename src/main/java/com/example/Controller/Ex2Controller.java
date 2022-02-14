package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Ex2;
import com.example.service.Ex2Service;

@Controller
@RequestMapping("/ex2")
public class Ex2Controller {
	
	@Autowired
	private Ex2Service service;
	
	@RequestMapping("")
	public String index() {
		return "EX2/search";
	}
	
	@RequestMapping("/search")
	public String search(Integer price,Model model) {
		if(price == null) {
			List<Ex2> allList= service.showAll();
			model.addAttribute("allList",allList);
		}else {
			List<Ex2> list = service.findByPrice(price);
			model.addAttribute("list",list);
		}
		
		return "EX2/search";
		
	}
	
	

}

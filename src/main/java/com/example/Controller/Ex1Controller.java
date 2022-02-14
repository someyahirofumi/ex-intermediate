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
	
	/**
	 * 一覧画面を表示
	 * @param model　model内に全チームリストを格納
	 * @return
	 */
	@RequestMapping("")
	public String index(Model model) {
		List<Ex1Team> team = new ArrayList<>();
		team = service.teamList();
		model.addAttribute("team",team);
		
		
		return "EX1/showList";
	}
	
	/**
	 * クリックされた球団の名前をもとにDBよりデータ取得
	 * @param teamName　名前をもとに検索　
	 * @param model
	 * @return
	 */
	@RequestMapping("showdetail")
	public String showDetail(String teamName,Model model) {
		Ex1Team team = service.load(teamName);
		model.addAttribute("teamdetail",team);
		return "EX1/showdetail";
		
	}
	
	/**
	 * 球団リストに戻る
	 * @param model
	 * @return
	 */
	@RequestMapping("back_to_list")
	public String backToList(Model model) {
		return index(model);
	}
}

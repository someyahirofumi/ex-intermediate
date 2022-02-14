package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.domain.Ex1Team;

@Repository
public class Ex1TeamRepository {
	@Autowired
	NamedParameterJdbcTemplate template;
	
	private static final RowMapper<Ex1Team> EX1TEAM_ROW_MAPPER= new BeanPropertyRowMapper<>(Ex1Team.class);

	
	public Ex1Team showDetail(String teamName) {
		String sql ="SELECT *  FROM teams WHERE team_name=:teamName;";
		SqlParameterSource param =new MapSqlParameterSource("teamName",teamName);
		Ex1Team team = template.queryForObject(sql, param, EX1TEAM_ROW_MAPPER);
		return team;
	}
	
	public List<Ex1Team> showAll(){
		String sql ="SELECT team_name FROM teams ORDER BY inauguration;";
	    List<Ex1Team> teamNameList = template.query(sql, EX1TEAM_ROW_MAPPER);
	    return teamNameList;
	}
	
	
	
}

package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.domain.Ex2;

@Repository

public class Ex2Repository {
	
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	private static final RowMapper<Ex2> EX2_ROW_MAPPER=new BeanPropertyRowMapper<>(Ex2.class);
	
	public List<Ex2> findByPrice(Integer price){
		String sql ="SELECT * FROM hotels WHERE price<=:price;";
		SqlParameterSource param =new MapSqlParameterSource("price",price);
		List<Ex2> list = template.query(sql, param,EX2_ROW_MAPPER);
		return list;
	}
	
	public List<Ex2> showAll(){
		String sql ="SELECT * FROM hotels;";
		List<Ex2> allList =template.query(sql, EX2_ROW_MAPPER);
		return allList;
	}

}

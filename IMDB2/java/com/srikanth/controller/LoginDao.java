package com.srikanth.controller;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;

@Autowired
DataSource datasource;

@Autowired
JdbcTemplate jdbcTemplate1

public class LoginDao {
	private JdbcTemplate jdbcTemplate1;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) 
	{  
	    this.jdbcTemplate1 = jdbcTemplate;  
	}  
	
	


	public boolean checkUser()
	{
		
		return false;
		
		
	}
}



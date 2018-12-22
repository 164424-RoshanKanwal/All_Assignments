package com.roshan.spring.demoDB;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDaoImpl implements IUserDao {

	private JdbcTemplate jdbcTemplate;
	
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}



	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



	@Override
	public boolean userValidate(User user) {
	
		return false;
	}

}

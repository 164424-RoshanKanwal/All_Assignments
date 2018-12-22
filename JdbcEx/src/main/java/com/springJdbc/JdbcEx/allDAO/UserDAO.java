package com.springJdbc.JdbcEx.allDAO;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springJdbc.JdbcEx.pojo.User;

public class UserDAO {

	JdbcTemplate jdbcTemplate ;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}



	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public UserDAO() {
	
	}

	public void addNewUser(User user){
		String sqlQuery = "insert into UserInfo values (" + user.getUserId() + "," + user.getName() + "," + user.getPassword() + ")";
		
		jdbcTemplate.update(sqlQuery);
		
	}
	
}

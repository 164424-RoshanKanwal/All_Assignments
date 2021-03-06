package com.roshan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.roshan.validate.IUserDAO;
import com.roshan.validate.User;

public class UserDAOVersion2 implements IUserDAO {

	@Override
	public String getUserType(String userName, String password) {
		
		try {
			Connection connection = ConnectionFactory.getConnection();
			PreparedStatement statement = connection
					.prepareStatement("select * from UserTable where Username =? and Password =?");
			statement.setString(1, userName);
			statement.setString(2, password);
			ResultSet set = statement.executeQuery();
			while (set.next()) {
				if (set.getString("userName").equals(userName)
						&& set.getString("password").equals(password)) {
					return set.getString("userType");
				}

			}

		} catch (SQLException e) {
			System.out.println(e);
		}catch (ClassNotFoundException e) {
			System.out.println(e);
		}

		return null;
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void changePassword(String oldPassword, String newPassword) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeUser(User user) {

	}


}

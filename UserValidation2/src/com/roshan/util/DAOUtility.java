package com.roshan.util;

import com.roshan.dao.UserDAOVersion3;
import com.roshan.validate.IUserDAO;


public class DAOUtility {

	public static IUserDAO getUserDAO(){
		
		
		return new UserDAOVersion3();
	}
	
	
}

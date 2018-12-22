package com.roshan.sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class ImageInsertion {
static Connection connection;
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system", "orcl11g");
		
		System.out.println(connection);		//null
		PreparedStatement ps = connection.prepareStatement("insert into imageInsertion values(?,?)");
		ps.setString(1,"firstImage");
		
		FileInputStream fin = new FileInputStream("D:\\first.jpeg");
		ps.setBinaryStream(2, fin, fin.available());
		int i = ps.executeUpdate();
		System.out.println(i + "records effected");
		connection.close(); 
		}
		catch (SQLException | FileNotFoundException e){
			e.printStackTrace();
		}
		
		
	}
	
	//public static void insertImage(String name, )
	
	
}

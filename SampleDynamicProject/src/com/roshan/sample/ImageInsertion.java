package com.roshan.sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ImageInsertion {
static Connection connection;
	public static void main(String[] args) throws IOException {
		
		try{
		PreparedStatement ps;
		connection = ConnectionFactory.getConnection();
		ps= connection.prepareStatement("insert into imageInsertion values(?,?)");
		ps.setString(1,"firstImage");
		
		FileInputStream fin = new FileInputStream("D:\\first.jpeg");
		ps.setBinaryStream(2, fin, fin.available());
		int i = ps.executeUpdate();
		System.out.println(i + "records effected");
		
		ps = connection.prepareStatement("select * from imageInsertion");
		ResultSet rs=ps.executeQuery();  
		if(rs.next()){//now on 1st row  
		              
		Blob b=rs.getBlob(2);//2 means 2nd column data  
		byte barr[]=b.getBytes(1,(int)b.length());//1 means first image  
		              
		FileOutputStream fout=new FileOutputStream("d:\\sonoo.jpg");  
		fout.write(barr); 
		fout.close();
		connection.close(); 
		}}
		catch (SQLException | FileNotFoundException e){
			e.printStackTrace();
		}
		
		
	}
	
	//public static void insertImage(String name, )
	
	
}

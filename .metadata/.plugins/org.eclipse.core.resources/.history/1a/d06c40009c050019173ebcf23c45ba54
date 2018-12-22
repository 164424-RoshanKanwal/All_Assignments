package com.project.shopcart.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.project.shopcart.daointerface.IProductsDAO;
import com.project.shopcart.pojo.Products;

public class ProductsDAOImpl implements IProductsDAO{
	

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public List<Products> getallproducts() {
		 return jdbcTemplate.query("select * from products",new RowMapper<Products>(){  
			    @Override  
			    public Products mapRow(ResultSet rs, int rownumber) throws SQLException {  
			        Products products=new Products();  
			        products.setProductId(rs.getInt(1));
			        products.setName(rs.getString(2));
			        products.setPrice(rs.getInt(3));
			        products.setQuantity(rs.getInt(4));
			        return products;  
			    }  
			    });  
	}

	@Override
	public Products get(int productId) {
		
		
		
		return null;
	}

	@Override
	public boolean add(Products product) {
		String sqlQuery = "insert into products values(?,?,?,?)";
		jdbcTemplate.update(sqlQuery, product.getProductId(), product.getName(), product.getPrice(),product.getQuantity());
		return false;
	}

	@Override
	public boolean remove(int productId) {
		String sqlQuery = "delete from products where userId =?";
		jdbcTemplate.update(sqlQuery, productId);		
		return false;
	}

	@Override
	public boolean update(Products product) {
		String sqlQuery = "Update products set name=?, price=?, quantity =? where productId=?";
		jdbcTemplate.update(sqlQuery, product.getName(), product.getPrice(), product.getQuantity(), product.getProductId());		
		return false;
	}

}

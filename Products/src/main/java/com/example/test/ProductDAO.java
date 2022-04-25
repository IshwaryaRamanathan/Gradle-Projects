package com.example.test;

import java.sql.PreparedStatement;

import javax.sql.DataSource;
import javax.swing.tree.RowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class ProductDAO {
	
@Autowired	
JdbcTemplate jdbcTemplate;

//String SQL_SELECT="select* from product";

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}


public int addProduct(Product p) {
	System.out.println();
	String query="insert into product values('"+p.getPid()+"','"+p.getPname()+"','"+p.getPdesc()+"','"+p.getDomf()+"','"+p.getDoexp()+"','"+p.getSupplier()+"','"+p.getQty()+"')";
	return jdbcTemplate.update(query);
}

/*Product getProducts(int pid) {
	 String query="select* from product where pid=?";
     return jdbcTemplate.queryForObject(query, new Object[] { pid },new RowMapper<Product>()){
    	 public Product mapRow(ResultSet rs,int rowNum) throws SQLException{
    		 return new Product(rs)
    	 }
     });
	
}*/



void deleteProduct() {
	
}

void updateProduct() {
	
}
}

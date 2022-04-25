package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductRepository repo;
	
	@Override
	public Product2 saveProduct(Product2 p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product2> fetchProductList() {
		// TODO Auto-generated method stub
		List<Product2> list=repo.findAll();
		return list;
	}

	@Override
	public Product2 updateProduct(Product2 p, int prodid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteproductById(int prodid) {
		// TODO Auto-generated method stub
		
	}

}
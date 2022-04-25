package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface ProductService {
	Product2 saveProduct(Product2 p);
	List<Product2> fetchProductList();
	Product2 updateProduct(Product2 p,int prodid);
	void deleteproductById(int prodid);

}

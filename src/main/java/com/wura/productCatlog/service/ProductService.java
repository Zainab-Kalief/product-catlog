package com.wura.productCatlog.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.wura.productCatlog.models.Product;

@Service 
public class ProductService {
	List<Product> products = new ArrayList<>();
	
	public List<Product> all() {
		return products;
	}
	public void add(Product product) {
		products.add(product);
	}
	public Product find(Integer id) {
		return products.get(id);
	}
	public Product update(Integer id, Product product) {
		if(id < products.size()) {
			return products.set(id, product);
		}
		return null;
	}
	public void delete(Integer id) {
		if(id < products.size()) {
			products.remove(products.get(id));
		}
	}
}

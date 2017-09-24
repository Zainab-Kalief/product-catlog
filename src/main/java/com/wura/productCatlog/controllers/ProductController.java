package com.wura.productCatlog.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wura.productCatlog.models.Product;
import com.wura.productCatlog.service.ProductService;

@RestController
public class ProductController {
	private final ProductService service;
	public ProductController(ProductService service) {
		this.service = service;
	}
	@RequestMapping("/")
	public String index() {
		return "hiiii";
	}
	
	@RequestMapping("/products")
	public List<Product> products() {
		return service.all();
	}
	
	@RequestMapping(path="/new", method=RequestMethod.POST) 
	public  void newProduct(@RequestBody Product product) {
		service.add(product);
	}
	@RequestMapping("/{id}") 
	public Product getProduct(@PathVariable("id") Integer id) {
		return service.find(id);
	}
	@RequestMapping(path="/{id}", method=RequestMethod.PUT)
	public Product update(@PathVariable("id") Integer id, @RequestBody Product product) {
		return service.update(id, product);
	}
	@RequestMapping(path="/{id}", method=RequestMethod.DELETE )
	public List<Product> delete(@PathVariable("id") Integer id) {
		service.delete(id);
		return service.all();
	}
	
}

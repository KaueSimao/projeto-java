package com.projetojava.javaproject.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetojava.javaproject.entites.Departament;
import com.projetojava.javaproject.entites.Product;

@RestController
@RequestMapping(value= "/products")
public class ProductController {
	
	@GetMapping
	public List<Product> getObjetcs() {
		Departament	d1 = new Departament (1L, "Tech");
		Departament d2 = new Departament (2L, "Pet");
		
		Product p1 = new Product(1L, "MacBook Pro", 4000.0, d1); 
		Product p2 = new Product(2L, "Pc Gamer", 5000.0, d1); 
		Product p3 = new Product(3L, "Casinha De Cachorro", 400.0, d2); 
		
		List<Product> list = Arrays.asList(p1, p2, p3);
		return list;

	}
}

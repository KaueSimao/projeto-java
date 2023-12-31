package com.projetojava.javaproject.entites;

public class Product {
	private Long id;
	private String name;
	private Double price;
	
	private Departament departament;
	
	public Product () {
		
	}
	

	public Product(Long id, String name, Double price, Departament departament) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.departament = departament;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Departament getDepertament() {
		return departament;
	}

	public void setDepertament(Departament depertament) {
		this.departament = depertament;
	}
	
	
	
	
}

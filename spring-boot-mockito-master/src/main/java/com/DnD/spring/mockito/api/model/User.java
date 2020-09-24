package com.DnD.spring.mockito.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Document(collection = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
	public User(int i, String string, int j, String string2) {
		// TODO Auto-generated constructor stub
	}
	@Id
	private String name;
	private int age;
	private String address;
	private String productName;
	private int quantity;
	private String productId;
	
	
	
	public User(String name, int age, String address, String productName, int quantity, String productId, int id) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.productName = productName;
		this.quantity = quantity;
		this.productId = productId;
		this.id = id;
	}
	
	
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
}

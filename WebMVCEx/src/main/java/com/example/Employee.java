package com.example;

public class Employee {
	
	public int no;
	public String name;
	public String email;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Employee [no=" + no + ", name=" + name + ", email=" + email + "]";
	}
	
	
	
	
}

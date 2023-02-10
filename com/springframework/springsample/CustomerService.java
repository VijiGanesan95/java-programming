package com.springframework.springsample;

public class CustomerService {
	private String name;
	private String url;
	public CustomerService(String name, String url) {
		super();
		this.name = name;
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "CustomerService [name=" + name + ", url=" + url + "]";
	}
	
	public void printName() {
		System.out.println("customer name: "+this.name);
	}
	public void printUrl() {
		System.out.println("customer name: "+this.url);
	}
	public void printThrowException() {
		throw new IllegalArgumentException();
		
	}
	
}

package com.simple.ex02;

public class Hotel {
	private Chef chef;
	
	//호텔이 쉐프에 의존적이다.
	public Hotel(Chef chef) {
		this.chef = chef;
	}
	
	public Chef getChef() {
		return chef;
	}
}

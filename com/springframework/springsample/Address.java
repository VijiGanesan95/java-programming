package com.springframework.springsample;

public class Address {
	int StNo;
	String lane;
	String City;
	String state;
	int postal_code;
	
	public Address() {
		
	}

	public Address(int stNo, String lane, String city, String state, int postal_code) {
		super();
		StNo = stNo;
		this.lane = lane;
		City = city;
		this.state = state;
		this.postal_code = postal_code;
	}

	public int getStNo() {
		return StNo;
	}

	public void setStNo(int stNo) {
		StNo = stNo;
	}

	public String getLane() {
		return lane;
	}

	public void setLane(String lane) {
		this.lane = lane;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(int postal_code) {
		this.postal_code = postal_code;
	}

	@Override
	public String toString() {
		return "Address [StNo=" + StNo + ", lane=" + lane + ", City=" + City + ", state=" + state + ", postal_code="
				+ postal_code + "]";
	}
	
}

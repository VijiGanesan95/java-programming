package com.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer {
    String name;
    String address;
    @Autowired
    @Qualifier("technologies")
    Technologies techDetails;

    public Technologies getTechDetails() {
        return techDetails;
    }

    public void setTechDetails(Technologies techDetails) {
        this.techDetails = techDetails;
    }

    public Customer() {
    }

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void display(){
        System.out.println("cust object successful");
        techDetails.tech();

    }
}

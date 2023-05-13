package com.example.javaproject2.week4.day5;

import com.example.javaproject2.week4.day5.Address;

public class Hospital {
    private String name;
    private String mobileAddress;
//    String address;
    private Address address;

    public String getName() {
        return name;
    }

    public String getMobileAddress() {
        return mobileAddress;
    }

    public Address getAddress() {
        return address;
    }

    public Hospital(String name, String mobileAddress, Address address) {
        this.name = name;
        this.mobileAddress = mobileAddress;
        this.address = address;
    }
}

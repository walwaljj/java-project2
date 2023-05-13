package com.example.javaproject2.week4.day4;

public class Users {

    private String name;
    private String phoneNumber ;
    private int age;

    public Users() {
    }

    public Users(String name, String phoneNumber, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    // Getter & Setter : 멤버변수에 직접 접근하지 않고 값을 수정하거나 조회함.
    //                   필요할 때만 만듦. 일반정으로
    // getter : 접근 제어로직
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    // setter : 본인 확인 로직
    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    boolean isAdult(){
        return age >= 10;
    }




}

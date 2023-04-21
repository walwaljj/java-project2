package com.example.javaproject2.week1.day5;

public class User {
    public int age;
    public String phoneNumber;

    public String name;

    public void userInfo(){
        System.out.printf("%s 는 %d 살 입니다. \n전화번호는 %s 입니다. \n " , name, age, phoneNumber);
    }

    boolean isAdult(){
        return age >= 18;
    }
}

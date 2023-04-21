package com.example.javaproject2.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User sh = new User();
        sh.name = "수현";
        sh.phoneNumber = "010-1111-2222";
        sh.age = 29;

        sh.userInfo();
        System.out.printf("%s님은 성인입니까 ? = %b \n",sh.name, sh.isAdult());
    }
}

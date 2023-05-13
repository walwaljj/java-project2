package com.example.javaproject2.week4.day1;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "수현";
        user1.age = 1;
        System.out.printf("%s는 %d살 >.6 ♥\n",user1.name,user1.age);
        System.out.printf("%s는 어른인가염? %s",user1.name,user1.isAdult());
        System.out.println("=====================");
        User user2 = new User();
        user2.name = "수현2";
        user2.age = 2;
        user2.phoneNumber = "010-1111-2222";
        System.out.printf("%s는 %d살 \n",user2.name,user2.age);
        System.out.printf("%s 전화번호 %s\n",user2.name,user2.phoneNumber);
        System.out.printf("%s는 어른인가염? %s",user2.name,user2.isAdult());
    }
}
package com.example.javaproject2.week4.day4;

import com.example.javaproject2.week4.day1.User;

import java.util.ArrayList;
import java.util.List;

public class UserTest {
    
    public static void main(String[] args) {
        Users user1 = new Users("수현1","000-0000-0000",1);
        userInfo(user1);

        Users user2 = new Users();
        user2.setName("수현2");
        user2.setAge(2);
        user2.setPhoneNumber("010-1111-2222");

        userInfo(user2);
    }

    private static void userInfo(Users user) {
        String info = String.format("%s (이)는 %d 살 입니다. %s(이)의 번호는 %s 입니다.", user.getName(),user.getAge(), user.getName(),user.getPhoneNumber());
        System.out.println(info);
    }

}

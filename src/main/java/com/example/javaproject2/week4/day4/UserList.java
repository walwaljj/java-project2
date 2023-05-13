package com.example.javaproject2.week4.day4;

import java.util.ArrayList;
import java.util.List;

public class UserList {
    public static void main(String[] args) {
        List<Users> usersList = new ArrayList<>();
        Users user1 = new Users("수현1","11111111111111",20);
        Users user2 = new Users("수현2","22222222222222",20);
        usersList.add(user1);
        usersList.add(user2);

        for (Users users : usersList) {
            System.out.println(users.getName());
            System.out.println(users.getPhoneNumber());
            System.out.println(users.getAge());
        }

    }
}

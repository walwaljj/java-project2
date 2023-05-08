package com.example.javaproject2.week4.day1;

import static org.junit.jupiter.api.Assertions.*;

class UserFactoryTest {
    public static void main(String[] args) {
        UserFactory userFactory = new UserFactory();
        User user = userFactory.getAdultUser();
        System.out.println(user.age);
    }

}
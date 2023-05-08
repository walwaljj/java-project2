package com.example.javaproject2.week4.day1;

public class VariousReturnType {
    public static void main(String[] args) {
        VariousReturnType vrt = new VariousReturnType();
        User user = vrt.getUser();
        int plus = vrt.plus();
        boolean adult = vrt.isAdult();
        vrt.printHello();
    }

    public boolean isAdult(){
        return true;
    }

    public int plus(){
        return 1 + 1;
    }
    public User getUser(){
        return new User();
    }

    public void printHello(){
        System.out.println("Hello");
    }
}

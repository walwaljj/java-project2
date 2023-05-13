package com.example.javaproject2.week4.day4;


import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ListEx {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        l1.add("Hello");
        l1.add(1+"");

        for (String s : l1) {

        }

        System.out.println(l1.get(0));
        System.out.println(l1.get(1));
        System.out.println(l1.size());
        System.out.println(l1.remove(0));
        System.out.println(l1.get(0));
        System.out.println(l1.isEmpty());
        System.out.println(l1.remove(0));
        System.out.println(l1.size());
//        System.out.println(l1.get(0));
        System.out.println(l1.isEmpty());


    }
}

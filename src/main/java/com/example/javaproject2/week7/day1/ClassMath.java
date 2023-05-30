package com.example.javaproject2.week7.day1;

import java.util.ArrayList;
import java.util.List;

public class ClassMath {
    public boolean isPrime(int num){
        return numbers(num).size() == 1;
//        for (int i = 2 ; i < num ; i++) {
//            if(num % 2 == 0)
//                return false;
//        }
//        return num == 1 ? false : true;
    }

    public boolean isPerfectNumber(int num){
        List<Integer> numbers = numbers(num);
        int sum = 0;
//        for (int i = 1 ; i < num; i++) {
//            if(num % i == 0){
//                sum += i;
//            }
//        }
        sum = numbers.stream().mapToInt(Integer::intValue).sum();
        return num == sum ;
    }

    private List<Integer> numbers(int num){
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1 ; i < num; i++) {
            if(num % i == 0){
                numbers.add(i);
            }
        }
       return numbers;
    }

    public String numbersToString(int num){
        return numbers(num).toString();
    }


}

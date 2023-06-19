package com.example.javaproject2.algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BFPatternMatching {
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String target = reader.readLine();
        String pattern = reader.readLine();

        int tarIdx = 0;
        int patIdx = 0;
        for (int i = 0; i < target.length(); i++) {

            if(pattern.charAt(patIdx) != target.charAt(tarIdx)){
                patIdx = 0;
            }
            if(patIdx == pattern.length()-1){
                System.out.println(tarIdx - patIdx);
                break;
            }
            patIdx++;
            tarIdx++;
        }

        if(pattern.length()-1 != patIdx){
            System.out.println("404 Not Found");
        }



//        while (tarIdx < target.length() && patIdx < pattern.length()){
//            if(target.charAt(tarIdx) != pattern.charAt(patIdx)){
//                tarIdx -= patIdx;
//                patIdx = -1;
//            }
//
//            tarIdx ++;
//            patIdx ++;
//        }
//
//        if(patIdx == pattern.length()){
//            System.out.println(tarIdx - patIdx);
//        }
//        else{
//            System.out.println("404 Not Found");
//        }
    }

    public static void main(String[] args) throws IOException {
        new BFPatternMatching().solution();
    }

    ////qwertyuiuiuytrertyuiopopoiuytrqwertyuytrertywqwertyuiuytrewqwertyuiiuiuiytrewert
    ////    // qwert
}

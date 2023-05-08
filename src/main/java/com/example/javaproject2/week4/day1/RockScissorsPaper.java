package com.example.javaproject2.week4.day1;

import java.util.Scanner;

public class RockScissorsPaper {

    public static void main(String[] args) {

        RockScissorsPaper code = new RockScissorsPaper();
        code.untilWin();

    }
    public int getNum(String result){
        int num = 0;
        num = result == "바위" ? 0 : (num = result == "가위" ? 1 : 2);
        return num;
    }
    public String untilWin() {

        Scanner sc = new Scanner(System.in);
        String str = "";
        while (true){
            System.out.print("가위 바위 보 중 하나를 내세요 :  ");

            String kwanghyeon = sc.nextLine();
            int comp = (int)(Math.random()*2);

            int user = getNum(kwanghyeon);

            if (user == 0 && comp == 1 || user == 1 && comp == 2 || user == 2 && comp == 0) {
                str = "이겼습니다. 프로그램을 종료합니다.";
                System.out.println(str);
                break;
            } else if (user == comp) {
                str = "비겼습니다.";
                System.out.println(str);
            } else {
                str = "졌습니다.";
                System.out.println(str);
            }
        }
        return str;
    }
}

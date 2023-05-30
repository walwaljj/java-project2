package com.example.javaproject2.week7.day1;

public class Game {
    public static void main(String[] args) {
        Game game = new Game();

        for (int i = 0; i < 100; i++) {
//            System.out.println(i+" "+getString(i));
            System.out.println(i + game.is369(i));
        }
    }

    private String getString(int i) {
        String str = "";
        if ((i % 10) % 3 == 0 && i != 0){
            str += "*";
        }
        if((i / 10) % 3 == 0 && i > 10){
            str += "*";
        }
        return str;
    }
//-----------------내가 작성한 코드----------------

    public String is369(int i) {
        int a = i / 10;
        int b = i % 10;
        String str = (b % 3 == 0 )&& b != 0 ? "*" : "";
        if(a == 0) return str;
        return str + is369(a);
    }
}

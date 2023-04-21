package com.example.javaproject2.week1.day5;

public class SpaceInvader {
    private void moveLeft(){
        int location = 0 ;
        location = -1;
        System.out.println("location = " + location);
    }
    private void moveRight(){
        int location = 0 ;
        location = 1;
        System.out.println("location = " + location);
    }

    public static void main(String[] args) {
        SpaceInvader si = new SpaceInvader();
        si.moveLeft();
        si.moveRight();
    }
}

package com.example.javaproject2.week1.day5;

public class SpaceInvaderMemberVariable {
    int location ; // 멤버변수, 초기화 하지 않고 선언만 함.
    private void moveLeft(){

        location = location - 1;
//        System.out.println("moveLeft 실행 , 현재 location" + location);
    }
    private void moveRight(){

        location = location + 1;
//        System.out.println("moveRight 실행 , 현재 location" + location);
    }

    public static void main(String[] args) {
        SpaceInvaderMemberVariable simv = new SpaceInvaderMemberVariable();
        // 인스턴스화로 멤버변수 location 의 기본값이 메모리에 저장됨(int 의 기본값 0).

        simv.moveLeft();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();
        
        System.out.println("location 의 최종 위치 = " + simv.location);

    }
}

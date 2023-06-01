package com.example.javaproject2.week7.opgame.model;

public class Member {
    String id;
    boolean isLongined;
    public Member(String id, boolean isLogined) {
        this.id = id;
        this.isLongined = isLogined;

    }

    public String getID() {
        return id;
    }

    public boolean isLongined() {
        return isLongined;
    }
}

package com.example.javaproject2.week7.day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void testis369(){
        assertEquals("*", Game.is369(03));
//        assertEquals("", Game.is369(100)); //*
        assertEquals("**", Game.is369(66));
    }

}
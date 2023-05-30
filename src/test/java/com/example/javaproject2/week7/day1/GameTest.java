package com.example.javaproject2.week7.day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    Game game = new Game();
    @Test
    void testis369(){
        assertEquals("*", game.is369(03));
        assertEquals("", game.is369(100));
        assertEquals("**", game.is369(66));
    }

}
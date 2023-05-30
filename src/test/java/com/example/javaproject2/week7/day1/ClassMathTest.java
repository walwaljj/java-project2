package com.example.javaproject2.week7.day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassMathTest {
    ClassMath classMath = new ClassMath();
    @Test
    void testPrime() {
        assertTrue(classMath.isPrime(3));
        assertTrue(classMath.isPrime(7));
        assertFalse(classMath.isPrime(10));
        assertFalse(classMath.isPrime(1));
    }

    @Test
    void testPerfect(){
        assertTrue(classMath.isPerfectNumber(28));
        assertTrue(classMath.isPerfectNumber(6));
        assertFalse(classMath.isPerfectNumber(100));
    }

    @Test
    void testResult(){
        assertEquals("[1, 2, 4, 8]",classMath.numbersToString(16));
    }
}
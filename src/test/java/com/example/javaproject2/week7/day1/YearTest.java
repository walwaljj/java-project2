package com.example.javaproject2.week7.day1;

import com.example.javaproject2.week6.day5.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearTest {
    Year year = new Year();

    @Test
    void checkLeapYear() {
        assertEquals(false, year.checkLeapYear(1700));
    }

    @Test
    void testLeapYear(){
        assertEquals(false, year.isLeapYear(1700));
        assertEquals(true, year.isLeapYear(2020));
        assertEquals(true, year.isLeapYear(2400));
    }
}
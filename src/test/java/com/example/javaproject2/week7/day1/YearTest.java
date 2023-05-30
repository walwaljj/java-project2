package com.example.javaproject2.week7.day1;

import com.example.javaproject2.week6.day5.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearTest {

    @Test
    void checkLeapYear() {
        assertEquals(false, Year.checkLeapYear(1700));
    }
}
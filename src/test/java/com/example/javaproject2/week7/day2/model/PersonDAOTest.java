package com.example.javaproject2.week7.day2.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonDAOTest {
    PersonDAO personDAO = new PersonDAO();

    @Test
    void findByNamePerson() {
    }

    @Test
    void findAllPerson() {
        personDAO.insertPerson("leo");
        personDAO.insertPerson("yui");
        assertEquals("[001 leo, 002 yui]",personDAO.findAllPerson().toString());
    }

    @Test
    void insertPerson() {
    }

    @Test
    void setUp(){
        personDAO.initPerson();
    }


}
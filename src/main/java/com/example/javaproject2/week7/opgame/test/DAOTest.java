package com.example.javaproject2.week7.opgame.test;

import com.example.javaproject2.week7.opgame.model.MemberDAO;
import org.junit.jupiter.api.Test;
import com.example.javaproject2.week7.opgame.model.Member;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class DAOTest {

    @Test
    public void testLonginAndLogout(){
        String id = "tester";
        String pw = "1234";

        MemberDAO dao = new MemberDAO();
        dao.initMember();
        Optional<Member> user = dao.login(id, pw);

        if(user.isEmpty()){
            dao.join(id, pw);
            user = dao.login(id, pw);
        }

        assertEquals(id, user.get().getID());
        assertTrue(user.get().isLongined());

        user = dao.logout(id);
        assertFalse(user.get().isLongined());


    }
}

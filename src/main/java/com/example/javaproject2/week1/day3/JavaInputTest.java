package com.example.javaproject2.week1.day3;

import java.io.IOException;

public class JavaInputTest {
    public static void main(String[] args) throws IOException {
        JavaInput javaInput = new JavaInput();
        javaInput.readTwoChars(); // javaInput 은 throws 를 사용해 사용하는 클래스에 에러를 던짐.
                                //이 에러를 여기서 해결 하거나 , 사용시 마다 해결해야함.

        // .read 는 아스키 코드를 읽어옴.
        //123을 입력하면 49 가 나옴. 1만 읽음
        //abc를 입력하면 97 이 나옴. a만 읽음.

    }
}

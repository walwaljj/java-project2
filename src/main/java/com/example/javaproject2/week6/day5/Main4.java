package com.example.javaproject2.week6.day5;
class MyException extends Exception{
    public MyException(){
        super("error");
    }
    public MyException(String message){
        super(message);
    }
}
public class Main4 {
    public static void main(String[] args) {

        try{
            throwException();
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
    }

    private static void throwException() throws  MyException{
        throw new MyException("사용자 정의 예외 발생");
    }


}

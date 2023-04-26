package com.example.javaproject2.week2.day2;

public class StringTest {
    public static void main(String[] args) {
        String name = "수현"; // 1번
        String name1 = "수현"; // 동일한 문자가 StingConstantPool에 등록되었는지 확인
        String name2 = new String("수현");
        String name3 = new String("수현");

        System.out.println(name==name1);//true , name과 name1은 StringConstantPool의 같은곳을 가리키고 있다.
        System.out.println(name1==name2);//false , new 연산자를 사용해 heap내 주소값이 동일하지 않음
        System.out.println(name2==name3);//false

        System.out.println("name = " + name.hashCode());
        System.out.println("name1 = " + name1.hashCode());
        System.out.println("name2 = " + name2.hashCode());
        System.out.println("name3 = " + name3.hashCode()); // 모두같은 hash

        // name2.hashCode() 를 출력할때 name 과 같은 hash를 반환한다.
        // 같은 hash를 반환하는 이유는 StringConstantPool 문자열이 이미 생성이 되어있다면 ex ) String name = "수현";
        // new 를 이용해 name2를 생성하고 name2.hashCode() 를 하게되면
        // Heap의 StringConstantPool에서 문자를 먼저 찾아보기 때문에 name의 주소를 리턴하게 된다.


        // String에서 == , equals()
        // == 는 heap에 생성된 객체의 주소값을 비교
        // .equals() 는 문자열 그 자체 값의 비교

        //name == name1 true인 이유?
        // StringConstantPool에 생성된 같은 값을 비교했기 때문

        // name1 == name2 false인 이유?
        // StringConstantPool 과 new 로 생성한 객체의 heap내 주소값이 다르기 때문

        // name2 == name3 false인 이유?
        // new 연산자를 사용해 서로다른 객체를 생성했기 때문이다.

    }
}

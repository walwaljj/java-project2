package com.example.javaproject2.week2.day3;

public class ClassInSchoolTest {
    public static void main(String[] args) {
        ClassInSchool classInSchool = new ClassInSchool();
        classInSchool.no = 1;
        classInSchool.teacher = new Teacher();
        classInSchool.teacher.name = "teacher1";
        classInSchool.teacher.age = 111;
        classInSchool.teacher.address = "ㅎㅎ";
        classInSchool.students = new Student[30];

        System.out.printf("%d반 %s 선생님은 %d살 입니다.",classInSchool.no,classInSchool.teacher.name
                                ,classInSchool.teacher.age);

    }
}

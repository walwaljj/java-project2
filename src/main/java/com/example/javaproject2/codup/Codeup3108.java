package com.example.javaproject2.codup;

import java.io.*;
import java.util.*;

class Student{
    private String code;
    private int testId;
    private String name;

    public Student() {}

    public Student(String code, int testId, String name) {
        this.code = code;
        this.testId = testId;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public int getTestId() {
        return testId;
    }

    public String getName() {
        return name;
    }
}
public class Codeup3108 {

    private List<Student> students = new ArrayList<>();
    private Student makeStudent(String code, int testId, String getName){
        return new Student(code, testId, getName);
    }

     private boolean isExist(Student pStudent){
         for (Student student : students) {
             if( pStudent.getTestId() == (student.getTestId())){
                 return true;
             }
         }return false;
     }
    private void addAStudent(Student student) {
        if (!isExist(student)){
            students.add(student);
        }
    }

    private void deleteStudent(Student pStudent){
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getTestId() == pStudent.getTestId()){
                students.remove(i);
            }
        }

    }
    public void process(String line){//Student pStudent){
        String[] splitted = line.split(" ");
        Student student = makeStudent(splitted[0], Integer.parseInt(splitted[1]), splitted[2]);
        switch (student.getCode()){
            case "I" -> addAStudent(student);
            case "D" -> deleteStudent(student);
        }
    }

    public void printStudents(){
        for (Student student : students) {
            System.out.printf("%s , %d , %s",student.getCode(),student.getTestId(),student.getName());
        }
    }
    public void printSpecificStudents(int[] arr){
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getTestId() - o2.getTestId();
            }
        });

        for (int i = 0; i < arr.length; i++) {
            Student student = students.get(arr[i]-1);
            System.out.printf("%s %s\n",student.getTestId(),student.getName());
        }

    }


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Codeup3108 codeup = new Codeup3108();

        codeup.process("I 1011 한라산");
        codeup.process("I 999 백두산");
        codeup.process("I 999 오대산");
        codeup.process("D 999 백두산");
        codeup.process("I 800 백두산");
        codeup.process("D 500 한라산");
        codeup.process("I 900 남산");
        codeup.process("I 950 금강산");
        codeup.process("I 1205 지리산");
        codeup.process("I 700 북한산");
        codeup.printSpecificStudents(new int[]{1, 2, 4, 5, 6});
    }
}

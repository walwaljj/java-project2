package com.example.javaproject2.codup;

import java.util.*;

class Student2{
    String code;
    int number;
    String name;

    public String getCode() {
        return code;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Student2(String code, int number, String name) {
        this.code = code;
        this.number = number;
        this.name = name;
    }
}
public class Codeup3108_2 {

    List<Student2> students = new ArrayList<>();

    public Student2 makeAStudent(String code, int number, String name){
        return new Student2(code, number, name);
    }

    public boolean isDuplicated(Student2 pStudent){
  
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getNumber() == pStudent.getNumber()){
                return true;
            }
        }
        return false;
    }
    public void addOrDelete(String line){
        String[] split = line.split(" ");
        Student2 student = makeAStudent(split[0], Integer.parseInt(split[1]), split[2]);
        String code = student.getCode();
        switch (code){
            case "I" -> addAStudent(student);
            case "D" -> removeStudent(student);
        }
    } 
    public void addAStudent(Student2 student){
        students.add(student);
    }
    
    public void removeStudent(Student2 pStudent){
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getNumber() == pStudent.getNumber()){
                students.remove(i);
            }
        }
    }
    public void printStudents(){
        for (Student2 student : students) {
            System.out.printf("%s %s %s",student.getCode(),student.getNumber(),student.getName());
        }
    }
    public void printSpecificStudents(int arr[]){
        Collections.sort(students, new Comparator<Student2>() {

            @Override
            public int compare(Student2 o1, Student2 o2) {
                return o1.getNumber() - o2.getNumber();
            }
        });

        for (int i = 0 ; i < arr.length; i++) {
            Student2 student2 = students.get(arr[i] - 1);
            System.out.printf("%s %s %s\n",student2.getCode(),student2.getNumber(),student2.getName());
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Codeup3108_2 codeup = new Codeup3108_2();

        codeup.addOrDelete("I 1011 한라산");
        codeup.addOrDelete("I 999 백두산");
        codeup.addOrDelete("I 999 오대산");
        codeup.addOrDelete("D 999 백두산");
        codeup.addOrDelete("I 800 백두산");
        codeup.addOrDelete("D 500 한라산");
        codeup.addOrDelete("I 900 남산");
        codeup.addOrDelete("I 950 금강산");
        codeup.addOrDelete("I 1205 지리산");
        codeup.addOrDelete("I 700 북한산");
        codeup.printSpecificStudents(new int[]{1, 2, 4, 5, 6});
    }
}

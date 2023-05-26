package com.example.javaproject2.week6.day5;

interface Shape {
    double calculateArea();

    default void display(){
        System.out.println("디폴트 메서드"); // 구현하지 않아도 사용가능하다.
    }

    double calculatePerimeter();
}



// TODO: Circle 클래스 작성
class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
//        return radius * radius * 3.14 ;
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}


// TODO: Rectangle 클래스 작성

class Rectangle implements Shape{
    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return width * length;
    }

    @Override
    public double calculatePerimeter() {
        return (width + length) * 2;
    }
}

public class Main2{
    public static void main(String[] args){
//        Circle circle = new Circle(3);
//        System.out.println(circle.calculateArea());
//        circle.display();

        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(3.5);

        double area1 = rectangle.calculateArea();
        double perimeter1 = rectangle.calculatePerimeter();

        double area2 = circle.calculateArea();
        double perimeter2 = circle.calculatePerimeter();

        System.out.println("사각형의 넓이: " + area1);
        System.out.println("사각형의 둘레: " + perimeter1);
        System.out.println("원의 넓이: " + area2);
        System.out.println("원의 둘레: " + perimeter2);

    }
}

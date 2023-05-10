package com.example.javaproject2.week4.day2;

public class DiEx1 {
    private ShapeDrawer shapeDrawer;

    public DiEx1(ShapeDrawer shapeDrawer) {
        this.shapeDrawer = shapeDrawer;
    }

    public void doSth(){
        shapeDrawer.printPyramid(4);
    }
    private ParallelogramShapeDrawer parallelogramShapeDrawer;

    public  DiEx1(ParallelogramShapeDrawer parallelogramShapeDrawer){
        this.parallelogramShapeDrawer = parallelogramShapeDrawer;
    }
    public void doSth2(){
        parallelogramShapeDrawer.printPyramid(4);
    }
}

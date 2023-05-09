package com.example.javaproject2.week4.day2;

public class DiEx {
    private ShapeDrawer shapeDrawer;

    public DiEx(ShapeDrawer shapeDrawer) {
        this.shapeDrawer = shapeDrawer;
    }

    public void doSth(){
        shapeDrawer.printPyramid(4);
    }
    private ParallelogramShapeDrawer parallelogramShapeDrawer;

    public  DiEx(ParallelogramShapeDrawer parallelogramShapeDrawer){
        this.parallelogramShapeDrawer = parallelogramShapeDrawer;
    }
    public void doSth2(){
        parallelogramShapeDrawer.printPyramid(4);
    }
}

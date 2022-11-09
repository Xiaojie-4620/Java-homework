package com.xiaojie.exercise7_1;

public class Circle extends Geometric{
    private double r;
    final private double PI = 3.14;
    public Circle(){

    }

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double findArea() {
        return r * r * PI;
    }

    @Override
    public double findPerimeter() {
        return 2 * PI * r;
    }

    public void read() {
        System.out.println("The Circle's color is : " + this.color);
    }
}

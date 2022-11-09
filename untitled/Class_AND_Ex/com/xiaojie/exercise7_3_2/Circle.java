package com.xiaojie.exercise7_3_2;

public class Circle extends Shape{
    final double PI = 3.14;

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public void area() {
        System.out.println("面积为: " + (r * r * PI));
    }

    @Override
    public void perimeter() {
        System.out.println("周长为: "+ (2 * PI * r));
    }
}

package com.xiaojie.exercise7_3_2;

public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }
    @Override
    public void area() {

        double p = (a + b + c) / 2.0;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("面积为: " + area);
    }

    @Override
    public void perimeter() {
        System.out.println("周长为: " + (a + b + c));
    }
}

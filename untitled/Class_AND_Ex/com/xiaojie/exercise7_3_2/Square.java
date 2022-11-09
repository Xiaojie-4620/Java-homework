package com.xiaojie.exercise7_3_2;

public class Square extends Shape{

    public Square(double a, double b) {
        this.a = a;
        this.b = b;
    }
    private double a;
    private double b;
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public void area() {
        System.out.println("面积为: " + (a * b));
    }

    @Override
    public void perimeter() {
        System.out.println("周长为: "+ (a + b) * 2);
    }
}

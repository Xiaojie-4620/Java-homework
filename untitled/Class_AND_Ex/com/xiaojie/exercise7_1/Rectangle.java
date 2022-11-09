package com.xiaojie.exercise7_1;

public class Rectangle extends Geometric{
    private int length;
    private int width;
    public Rectangle() {
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double findArea() {
        return (int)length * width;
    }

    @Override
    public double findPerimeter() {
        return (int) ((length+width)*2);
    }

    public void read() {
        System.out.println("The Rectangle's color is: " + this.color);
    }
}

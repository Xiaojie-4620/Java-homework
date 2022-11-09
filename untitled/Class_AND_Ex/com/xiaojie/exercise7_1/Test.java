package com.xiaojie.exercise7_1;

public class Test {
    public static void main(String[] args) {
        Geometric circle = new Circle(3);
        circle.color = "blue";
        System.out.println(circle.findArea());
        System.out.println(circle.findPerimeter());
        Circle cir = (Circle) circle;
        cir.read();
        System.out.println("----------------------------------------------");
        Geometric rectangle = new Rectangle(3,4);
        rectangle.color = "red";
        System.out.println(rectangle.findPerimeter());
        System.out.println(rectangle.findArea());
        Rectangle re = (Rectangle) rectangle;
        re.read();
    }
}

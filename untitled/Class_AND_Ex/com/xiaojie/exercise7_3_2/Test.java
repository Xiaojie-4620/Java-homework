package com.xiaojie.exercise7_3_2;

public class Test {

    public static void main(String[] args) {

        Shape cir = new Circle(8.0);
        cir.area();
        cir.perimeter();
        System.out.println("-----------------------------------");
        Shape squ = new Square(4.0, 5.0);
        squ.perimeter();
        squ.area();
        System.out.println("-----------------------------------");
        Shape tra = new Triangle(3.0,4.0,5.0);
        tra.area();
        tra.perimeter();

    }
}

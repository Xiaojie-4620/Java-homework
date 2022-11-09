package com.xiaojie.exercise7_2;

public class ElectircCalculator implements Calable{

    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double reduce(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        if(b == 0) {
            System.out.println("Error: you have a num divide 0");
            return 0;
        }
        return a / b;
    }

    @Override
    public int residue(int a, int b) {
        return a % b;
    }

    @Override
    public int factorial(int n) {
        int sum = 1;
        for(int i = 1; i <= n; ++i) {
            sum *= i;
        }
        return sum;
    }
}

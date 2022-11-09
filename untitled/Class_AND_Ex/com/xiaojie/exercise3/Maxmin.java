package com.xiaojie.exercise3;

import javax.swing.*;

public class Maxmin {
    static void sortThreeNumber(int a, int b, int c){
        int temp;
        if(a > c){temp = a; a = c; c = temp;}
        if(a > b){temp = a; a = b; b = temp;}
        if(b > c){temp = b; b = c; c = temp;}

        System.out.println("The order of the three numbers is：");
        System.out.printf("%d,%d,%d",a,b,c);
    }
    public static void main(String[] args) {
        int max = 0;
        String a,b,c;
        a = JOptionPane.showInputDialog(null, "please input the first num");
        b = JOptionPane.showInputDialog(null, "please input the second num");
        c = JOptionPane.showInputDialog(null, "please input the third num");
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        int z = Integer.parseInt(c);
        sortThreeNumber(x,y,z);
    }
}

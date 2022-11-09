package Classin.com;

import java.util.Scanner;
public class fi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max;
        if(a > b){
            max = a;
            a = b;
            b = max;
        }
        if(a > c){
            max = a;
            a = c;
            c = max;
        }
        if(b > c){
            max = b;
            b = c;
            c = max;
        }
        System.out.print(a);
        System.out.print(' ');
        System.out.print(b);
        System.out.print(' ');
        System.out.print(c);
    }
}

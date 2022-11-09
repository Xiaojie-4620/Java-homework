package Classin.com;

import java.util.Scanner;

public class Throws关键字 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int result = a / b;
        System.out.println(result);
    }
}

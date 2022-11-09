package Classin.com;

import java.util.Scanner;

public class group {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input lines: ");
        int lines = in.nextInt();
        for(int i = 1; i <= lines; ++i){
            for(int j = 1; j <= i; ++j){
                System.out.printf("*");
            }
            System.out.print('\n');
        }
    }
}

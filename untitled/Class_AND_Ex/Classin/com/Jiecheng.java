package Classin.com;

import java.util.Scanner;

public class Jiecheng {
    static int Factorial(int n){
        int res = 1;
        for(int i = n; i >= 1; --i){
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {
        int num;
        int sum = 0;
        String output = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Please input three number to calculate");
        for(int i = 0; i < 3; ++i){
            num = input.nextInt();
            if(output == "")
                output = output + num + "! ";
            else
                output = output + "+ " + num + "!";
            sum += Factorial(num);
        }
        output += " = " ;
        System.out.print(output);
        System.out.print(sum);
    }
}

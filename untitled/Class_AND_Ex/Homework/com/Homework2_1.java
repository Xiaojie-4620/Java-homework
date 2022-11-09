package Homework.com;

import static Homework.com.MyHomeworkFnc.*;

public class Homework2_1 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; ++i){
            if(Narcissistic(i)) {
                System.out.print(i);
                System.out.print(' ');
            }
        }
    }
}

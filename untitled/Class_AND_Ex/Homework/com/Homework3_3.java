package Homework.com;

import static Homework.com.MyHomeworkFnc.*;

public class Homework3_3 {
    public static void main(String[] args) {
        int []a = new int[]{1, 7, 9, 11, 13, 15, 17, 19};
        int []b = new int[]{2, 4, 6, 8};
        int []newab = merge(a,b);
        int len = newab.length;
        for(int i = 0; i < len; ++i){
            System.out.print(newab[i]);
            System.out.print(' ');
        }
    }
}

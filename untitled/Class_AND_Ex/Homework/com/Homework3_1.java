package Homework.com;

import static Homework.com.MyHomeworkFnc.*;

public class Homework3_1 {
    public static void main(String[] args) {
        int []arr = new int[]{1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        int c = arr.length;
        int []arrnew = remove0(arr, c);
        for(int i = 0; i < arrnew.length; ++i){
            System.out.print(arrnew[i]);
            System.out.print(" ");
        }
        System.out.println(c);
    }
}

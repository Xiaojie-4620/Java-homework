package com.xiaojie.exercise4;

public class MergeArr {
    static void sort (int []a){
        int len = a.length;
        int temp = 0;
        for(int i = 0; i < len - 1; ++i){
            // boolean flag = true;
            for(int j = 0; j < len - i - 1; ++j){
                if(a[j] > a[j + 1]){
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                    //flag = false;
                }
                //if(flag) break;
            }
        }
        for(int i = 0; i < len; ++i )
            System.out.printf("%d ",a[i]);
    }
    static int [] mergeArr(int []a, int []b, int len) {
        int []arrC = new int [len];
        int j = 0;
        for(int i = 0; i < a.length; ++i){
            arrC[j] = a[i];
            j++;
        }
        for(int i = 0; i < b.length; ++i){
            arrC[j] = b[i];
            j++;
    }
        return arrC;
    }
    public static void main(String[] args) {
        int []arrA = new int[] {1, 7, 9, 11, 13, 15, 17, 19};
        int []arrB = new int[] {2, 4, 6, 8, 10};
        int len = arrA.length + arrB.length;
        int []arrC = mergeArr(arrA, arrB, len);
        System.out.println("After concat the arrA and arrB: ");
        for(int i = 0; i < len; ++i)
            System.out.printf("%d ",arrC[i]);
        System.out.println("\n\nSort arrC: ");
        sort(arrC);
    }
}

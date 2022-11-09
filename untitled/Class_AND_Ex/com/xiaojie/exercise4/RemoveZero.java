package com.xiaojie.exercise4;

public class RemoveZero {
    static int [] removeZero(int []a, int len){
        int zeroNum = 0;
        for(int i = 0; i < len; ++i){
            if(a[i] == 0) zeroNum++;
        }
        int []newArr = new int [len - zeroNum];
        for(int i = 0, j = 0; i < len; ++i)
        {
            if(a[i] > 0) {
                newArr[j] = a[i];
                j++;
            }
        }
        return newArr;
    }
    public static void main(String[] args) {
        int []arr = new int[]{1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5};
        int len = arr.length;
        int []newArr = removeZero(arr,len);
        for(int i = 0; i < newArr.length; ++i)
            System.out.printf("%d ",newArr[i]);
    }
}

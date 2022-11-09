package com.xiaojie.exercise8_1;

public class Test {

    public static void main(String[] args) {
        int x = -98;
        try {
            if(x > 0)
                throw new AaaException();
            else
                throw new BbbException();
        } catch (AaaException e) {
            System.out.println("捕获到AaaException异常");
        } catch (BbbException e) {
            System.out.println("捕获到BbbException异常");
        }
    }
}

package com.xiaojie.exercise5_2;

public class InnerClassTest {
    public static void main(String[] args) {
        Father father = new Father();
        //Father.Child child = father.new Child();
        //child.introFather();

        //Method1
        //father.show();

        // Method2
        // Father.Child c = new Father().new Child();
        // c.introFather();

        // Method3
        father.getInner().introFather();

    }
}

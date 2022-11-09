package com.xiaojie.exercise5_2;

public class Father {
    public Father() {
    }

    private String name = "zhangjun";

    //    public void show(){
//        Child d = new Child();

//        d.introFather();
//    }
    //
    public Child getInner() {
        return new Child();
    }

    //定义内部类
    class Child {
        public void introFather() {
            System.out.println(name);
        }
    }
}

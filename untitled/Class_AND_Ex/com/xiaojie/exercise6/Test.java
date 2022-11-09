package com.xiaojie.exercise6;

public class Test {
    public static void main(String[] args) {
        Dog d1 = new Dog();
//        Scanner in = new Scanner(System.in);
//        System.out.println("请依次输入狗狗的名字，年龄，品种，心情：");
//        String name = in.nextLine();
//        int age = in.nextInt();
//        String variety = in.nextLine();
//        String mood = in.nextLine();
        Dog d2 = new Dog("贵宾犬",5,"心情很好","甜心");
        Dog d3 = new Dog();
        d1.setMood("Good Mood");
        d3.setVariety("德国牧羊犬");
        d3.setName("太子");
        d3.setMood("心情不好");
        d2.Run();
        d2.bark();
        System.out.println("=======================================");
        d3.Run();
        d3.bark();
    }
}

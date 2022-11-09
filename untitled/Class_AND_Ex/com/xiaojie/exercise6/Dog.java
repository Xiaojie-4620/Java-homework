package com.xiaojie.exercise6;

public class Dog {
    private String variety;//狗的品种
    private int age;
    private String mood = "心情很好";
    private String name;

    public Dog() {

    }

    public Dog(String variety, int age, String mood, String name) {
        this.variety = variety;
        this.age = age;
        this.mood = mood;
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public void setMood(String mood) {
        if(mood == "心情很好" | mood == "心情不好")
            this.mood = mood;
        else
            System.out.println("输入信息错误"+",这只狗狗今天心情很好");
    }

    public String getName() {
        return name;
    }

    public String getMood() {
        return mood;
    }

    public String getVariety() {
        return variety;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void Run(){
        if(mood.equals("心情很好"))
            System.out.println("名字叫" + this.name + "的" + this.variety + this.mood + ",开心的围着主人身边转");
        else
            System.out.println("名字叫" + this.name + "的" + this.variety + this.mood + ",伤心的一动不动");
    }
    public void bark(){
        if(mood.equals("心情很好"))
            System.out.println("名字叫" + this.name + "的" + this.variety + this.mood + ",开心的汪汪叫");
        else
            System.out.println("名字叫" + this.name + "的" + this.variety + this.mood + ",伤心的呜呜叫");
    }
}

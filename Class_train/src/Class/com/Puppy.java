package Class.com;

import java.util.Scanner;

public class Puppy {
    private String variety;//狗的品种
    private int age;
    private String mood = "心情很好";
    private String name;

    public void Run(){
        if(mood == "心情很好")
        System.out.println("名字叫" + this.name + "的" + this.variety + this.mood + ",开心的围着主人身边转");
        else
        System.out.println("名字叫" + this.name + "的" + this.variety + this.mood + ",伤心的一动不动");
    }
    public void bark(){
         if(mood == "心情很好")
            System.out.println("名字叫" + this.name + "的" + this.variety + this.mood + ",开心的汪汪叫");
        else
            System.out.println("名字叫" + this.name + "的" + this.variety + this.mood + ",伤心的呜呜叫");
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

    public static void main(String[] args) {
        Puppy d1 = new Puppy();
//        Scanner in = new Scanner(System.in);
//        System.out.println("请依次输入狗狗的名字，年龄，品种，心情：");
//        String name = in.nextLine();
//        int age = in.nextInt();
//        String variety = in.nextLine();
//        String mood = in.nextLine();
        Puppy d2 = new Puppy();
        Puppy d3 = new Puppy();
        d1.setMood("Good Mood");
        d2.setMood("心情很好");
        d2.setVariety("贵宾犬");
        d2.setName("甜心");
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

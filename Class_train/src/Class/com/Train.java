package Class.com;

class Teacher{
    int age;
    int id;
    String name;

    public void Teacher(int id, int age, String name){
        age = age;
        name = name;
        id = id;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public String toString(){
        return "Teacher: "+"name = " + this.name + ";id = " + this.id + ";age = " + this.age;
    }
}

public class Train{
    public static void main(String[] args) {
        Teacher op = new Teacher();
        op.name = "qiQi";
        op.age = 500;
        op.id = 2;
        System.out.println(op.toString());
        System.out.println(op.name);
    }
}
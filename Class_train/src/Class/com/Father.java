package Class.com;

public class Father {
    int age;
    String name;
    int salary;
    public Father(){

    }
    public Father(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary(){
        return salary;
    }

    //Invoke the function and Class;
public static void main(String[] args) {
    Father f = new Father();
    Father s = new Father("zhangsan", 25, 30000);
    f.name = "lisi";
    f.salary = 5000;
    f.age = 23;
    System.out.println("Father s is: " + s.getName() + ",and his age: " + s.getAge() + " with Salary: " + s.getSalary());
    System.out.println("Father f is: " + f.getName() + ",and his age: " + f.getAge() + " with Salary: " + f.getSalary());
}
}
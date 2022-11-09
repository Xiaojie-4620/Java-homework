// java只能单继承， 但是java可以多层继承, Object类是一切类的父类

package ClassExtend;

public class Class_Father {
    public String name;
    public int age;
    public char gender;
    public String address;
    public Class_Father(){}
    public Class_Father(String name, int age, char gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

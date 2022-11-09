package 内部类.train1;

public class Test {
    public static void main(String[] args) {
        Car c = new Car();
        c.carName = "兰博基尼";
        c.carAge = 1;
        c.carColor = "blue";
        c.show();
        {
            Car.Engine en = new Car().new Engine();
            en.read();
        }
    }
}

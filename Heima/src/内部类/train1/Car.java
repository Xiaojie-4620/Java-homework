package 内部类.train1;

public class Car {
    private int money;
    String carName;
    int carAge;
    String carColor;

    public void show() {
        System.out.println(carName);
        //System.out.println(engineName);
    }

    // inner class
    class Engine {
        String engineName;
        int engineAge;

        public void show() {
            System.out.println(carName);
        }

        public void read() {
            System.out.println(money);
        }
    }
}

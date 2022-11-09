package 内部类.train2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Outer.Inner i = new Outer().new Inner();
        Outer.Inner i = new Outer.Inner();
        i.show();

        //Scanner s = new Scanner(System.in);
        //s.next();

    }
}

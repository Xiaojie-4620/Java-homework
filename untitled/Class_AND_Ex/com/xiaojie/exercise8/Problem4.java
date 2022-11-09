package com.xiaojie.exercise8;

class Exc0 extends Exception{}
class Exc1 extends Exc0{}

public class Problem4 {
    public static void main(String[] args) {
        try {
            throw new Exc1();
        } catch (Exception e) {
            System.out.println("Exception");
       /* } catch (Exc1 e) {
            System.out.println("Exc0");
        }*/
        }
    }
       /* try {
            throw new Exc1();
        } catch (Exc1 e) {
            System.out.println("Exception");
        } catch (Exception e) {
            System.out.println("Exc0");
        }
    }*/
}

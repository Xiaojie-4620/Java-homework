package JavaAPI;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

public class BigNUmber {
    public static void main(String[] args) {
//        Random RandSeed = new Random();
//        BigInteger num1 = new BigInteger("99999999");
//        BigInteger num2 = new BigInteger(8, RandSeed);
//        BigInteger num3 = new BigInteger("1");
//        System.out.println(num1.add(num3));
//        System.out.println(num2);


        //应该使用字符串的方式传参，直接传入小数时数据不精确
        var num1 = new BigDecimal("45.0245");
        var num2 = new BigDecimal("58.1245789522");
        var num3 = num1.add(num2);
        System.out.println(num3);
        double num4 = num1.doubleValue();
        System.out.println(num4);
    }
}

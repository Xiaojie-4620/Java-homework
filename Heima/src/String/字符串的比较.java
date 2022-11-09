package String;

public class 字符串的比较 {
    public static void main(String[] args) {
        // 常用的比较方法 -- 直接使用 == 符号进行判断
//        String a = "aaa";
//        String b = "bbb";
//        String c = "aaa";
//        System.out.println(a == c);
//        System.out.println(a == b);
        /* 当二者是 new创建的新对象时， == 符号比的是俩个引用变量的地址,此时俩个变量中即使内容一致但是地址不同，返回值为false
        String a = new String("aaa");
        String b = new String("aaa");
        String c = "aaa";
        System.out.println(a == b);
        System.out.println(a == c);
        */
        /* 因此使用String类中的方法进行比较 s1.equals(s2) 此方法区分s1 和 s2 中的大小写
           如若不考虑两字符串的大小写，s1.equalsIgnoreCase(s2)
         */
        String a = "Aaa";
        String b = "aaa";
        String c = "aaa";
        System.out.println(a.equals(b));
        System.out.println(b.equals(c));
        System.out.println(a.equalsIgnoreCase(c));

    }
}

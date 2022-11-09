package String;

public class StringBulider {

    public static void main(String[] args) {
        //内置函数
    /*
    String toString() // 转化为String
    reverse() //翻转字符串
    append() // 添加字符
    int length() // 返回长度
     */
        //判断是否为回文串
        String a = "123321";
        String b = new StringBuilder(a).reverse().toString();
        System.out.println(a.equals(b));
    }
}

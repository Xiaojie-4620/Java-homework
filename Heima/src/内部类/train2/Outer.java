package 内部类.train2;

public class Outer {
    private int a = 10;
    static class Inner{
        private int a = 20;
        public void show(){
            int a = 30;
            System.out.println(a);
            // this 本类对象的地址值
            System.out.println(this.a);
            // Outer.this 就是外部类对象的地址值
            //System.out.println(Outer.this.a);
        }
    }
}

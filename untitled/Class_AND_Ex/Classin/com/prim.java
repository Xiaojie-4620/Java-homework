package Classin.com;

public class prim {
    static boolean Prime(int n) {
        for(int i = 2; i <= n / i; ++i)
            if(n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        for(int i = 2; i < 100; ++i){
            if(Prime(i)) {
                System.out.print(i);
                System.out.print(' ');
            }
        }
    }
}

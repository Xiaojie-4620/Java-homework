package Homework.com;

public class MyHomeworkFnc {
    //菱形打印 方法
     public static void PrintRhombus(){
            //打印菱形的上半部分
            int line = 4;
            for(int i = 0; i < line; ++i){
                for(int j = 0; j < line - i - 1; ++j)
                    System.out.print(' ');
                for(int k = 0; k < 2 * i + 1;++k)
                    System.out.print('*');
                System.out.print('\n');
            }
            //打印菱形的下半部分
            for(int i = 0; i < line - 1; ++i){
                for(int j = 0; j < i + 1; ++j)
                    System.out.print(' ');
                for(int k = 0; k < line - i * 2 + 1; ++k)
                    System.out.print('*');
                System.out.print('\n');
            }
        }
    //输出水仙花数
    public static boolean Narcissistic(int a){
        int n, yes;
        yes = a;
        n = 0;
        while(a > 0){
            int m = a % 10;
            n += m * m * m;
            a /= 10;
        }
        return yes == n;
    }
    //转置输出数组
    public static void transposition(int []a){
         int n = a.length;
         for(int i = n - 1; i >= 0; --i){
             System.out.print(a[i]);
             System.out.print(' ');
         }
    }
    //移除数组中的0
    public static int[] remove0(int []a, int len) {
         int times = 0;
         int j = 0;
         int len_1 = len;
         for(int i = 0; i < len; ++i){
             if(a[i] == 0) times++;
         }
         int len1;
         len1 = len_1 - times;
         int []c = new int[len1];
         for(int i = 0; i < len; ++i){
             if(a[i] == 0)
                 continue;
             else {
                 c[j] = a[i];
                 j++;
             }
         }
         return c;
    }

    //将两个数组合并
    public static int[] merge(int []a, int []b){
         int lena = a.length;
         int lenb = b.length;
         int lenc = lena + lenb;
         int []c = new int[lenc];
         int j = 0;
         for(int i = 0; i < lena; ++i){
             c[j] = a[i];
             j++;
         }
         for(int k = 0; k < lenb; ++k){
             c[j] = b[k];
             j++;
         }
         return c;
    }
}

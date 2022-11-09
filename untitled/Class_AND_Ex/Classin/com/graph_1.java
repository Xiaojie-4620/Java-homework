package Classin.com;

public class graph_1 {

    public static void main(String[] args) {
        int line = 4;
        for(int i = 0; i < line; ++i){
            for(int j = 0; j < line - i - 1; ++j)
                System.out.print(' ');
            for(int k = 0; k < 2 * i + 1;++k)
                System.out.print('*');
            System.out.print('\n');
        }
    }
}

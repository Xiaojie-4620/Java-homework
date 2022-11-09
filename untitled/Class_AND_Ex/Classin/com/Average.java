package Classin.com;

import java.util.Scanner;

public class Average {
        static float Ave(float n, float sum){
            return n / sum;
        }
        static int getSum(int classMateNumber){
            int sum = 0;
            System.out.printf("Please input student's score\n");
            for(int i = 1; i <= classMateNumber; ++i){
                Scanner input = new Scanner(System.in);
                sum += input.nextInt();
            }
            return sum;
        }

        public static void main(String[] args) {
            int numberOfClass;
            Scanner in = new Scanner(System.in);
            numberOfClass = in.nextInt();
            for(int i = 0; i < numberOfClass; ++i){
                int num;
                num = in.nextInt();
                int sum;
                sum = getSum(num);
                System.out.printf("The total of the class is: " + sum);
                float ave = Ave(sum, num);
                System.out.printf(" and the average is: " + ave);
            }
        }

}

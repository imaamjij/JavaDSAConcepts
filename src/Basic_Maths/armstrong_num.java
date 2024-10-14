package Basic_Maths;

import java.util.Scanner;

public class armstrong_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int size= String.valueOf(num).length();
        int sum=0;

        while(num > 0){
            int rem = num % 10;
            sum += Math.pow(rem, size);
            num/=10;
        }
        System.out.println(sum);
    }
}

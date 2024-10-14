package Basic_Maths;

import java.util.Scanner;

public class Reverse_Num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();

        int op=0;
        while(num>0){
            int rem=num%10;
            num=num/10;
            op=op*10+rem;

        }
        System.out.print(op);
    }
}

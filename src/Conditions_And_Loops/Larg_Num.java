package Conditions_And_Loops;

import java.util.Scanner;

public class Larg_Num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max= a;

        if(b> max){
            max=b;
        }
        if(c> max){
            max=c;
        }
        System.out.println(max);
        // Instead of entire if condtion
        /*
        int max=Math.max(a,(Math.max(b,c));
        we can also use like this
        */


        // we can use Math.Max() too
        System.out.println(Math.max(20,40)); // Output will be 40
    }
}

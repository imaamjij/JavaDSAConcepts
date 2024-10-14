package Patterns;

import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();

        for(int i=1;i<=2*n - 1;i++){   // if n=3; it need to print, 5 lines; so, 2*n-1 is 2*3-1=5
            int stars=i; // it denotes 5 lines of *
            if(i>n){    // if i greater than n {which is 2*n-1} for 4th and 5th line
                stars=2*n-i; // stars will be 2*n-i { 2*3-4=2 }, so in 4th line it give 2 stars, in 5th give 1 stars
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

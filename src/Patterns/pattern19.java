package Patterns;

import java.util.Scanner;

public class pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int space=0;
        for(int i=1;i<=n;i++){
            //stars
            for(int j=0;j<=n-i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0;j<=n-i;j++){
                System.out.print("*");
            }
            space+=2;
            System.out.println();
        }
        int space1=2*n-2;
        for(int i=1;i<=n;i++){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=0;j<space1;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            space1-=2;
            System.out.println();

        }
    }
}

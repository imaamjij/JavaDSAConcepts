package Patterns;

import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //let n=3
        int spaces=2*n-1; //2*3-1=5
        for(int i = 1; i <= n; i++) {
            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(j); // its for left triangle numbers
            }
            //spaces
            for(int j=1;j<spaces;j++){ // here it print 4 spaces
                System.out.print(" ");
            }
            //numbers
            for(int j=i;j>=1;j--){ // its for right triangle numbers
                System.out.print(j);
            }

            System.out.println();
            spaces-=2; // every next line, spaces will reduce by 2; i.e, 4,2,0
        }
    }
}

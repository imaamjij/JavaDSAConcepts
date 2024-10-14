package Patterns;

import java.util.Scanner;

public class pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print("_");
            }
            //character
            char ch = 'A';
            int brkpoint= (2*i-1)/2;
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(ch);
                if(j<=brkpoint){
                    ch++;
                }else{
                    ch--;
                }
            }
            //spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print("_");
            }
            System.out.println();
        }
    }
}
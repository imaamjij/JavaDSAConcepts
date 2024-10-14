package Patterns;

import java.util.Scanner;

public class pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (char ch = (char) ('A'+(n - i)); ch<'A'+ n; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (char ch = (char) ('A'+(n - 1)); ch>='A'+(n-i); ch--) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

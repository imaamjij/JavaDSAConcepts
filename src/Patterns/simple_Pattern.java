package Patterns;

import java.util.Scanner;

public class simple_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("_");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <i; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= 2 * n - (2 * i )+ 1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("_");
            }
            System.out.println();
        }
    }
}

package Basics;

import java.util.Scanner;

public class reverse_with_rev_func {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String revStr= new StringBuilder(str).reverse().toString();

        System.out.println(revStr);

    }
}

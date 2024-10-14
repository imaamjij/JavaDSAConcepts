package Basics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Lets see, how to get input ");
        // For that we need to use the Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ur inputs :");

        // It dispaly the input
        System.out.println(input.nextLine()); // .nextLine() get the String as input
        System.out.println(input.nextInt()); // .nextLine() get the Integer as input
    }
}
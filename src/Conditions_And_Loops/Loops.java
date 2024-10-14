package Conditions_And_Loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // Print numberds from 1 to n
        Scanner input = new Scanner(System.in);
        int num= input.nextInt();

        // For loop
        // If we know the number of loops, then we can use for loop
        System.out.println("For Loop");
        for(int i=1; i<=num; i+=1){
            System.out.println(i + " ");
        }

        // Lets do same with while Loop
        // If we don't know the number of loops, then we can use for loop
        System.out.println("For While Loop");
        int a=1;
        while(a<=num){
            System.out.println(a + " ");
            a=a+1;
        }

        // Now with Do While Loop
        // It will execute the loop atleast once, even the condition is wrong
        System.out.println(" Do While Loop");
        int n=1;
        do{
            System.out.println(n);
            n++;
        }while(n<=num);
    }
}

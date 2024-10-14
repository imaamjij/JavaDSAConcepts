package Basics;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1= input.nextInt();
        int num2= input.nextInt();

        int sum= num1+num2;
        System.out.println("Basics.Sum = "+sum);

        float n1=input.nextFloat();
        float n2=input.nextFloat();
        float sum1=n1+n2;
        System.out.println("Basics.Sum = "+sum1);


    }
}

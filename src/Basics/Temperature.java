package Basics;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter in celcius: ");
        float tempC = input.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println("In Fahernit is "+tempF);
    }
}

package Basics;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ur rollno :");
        int rollno = sc.nextInt();
        System.out.println("Your rollno is 3118202050"+ rollno);

        //Lets get in String
//        System.out.print("Enter the string to check nextLine(): ");
//        String name=sc.nextLine();
//        System.out.println("This output by nextLine() " +name);

        //if i use next(), it only take the first word of string
        System.out.print("Enter the string to check next(): ");
        String FirstName= sc.next();
        System.out.println("This output by next() "+ FirstName);
    }
}

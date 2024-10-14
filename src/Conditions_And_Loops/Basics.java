package Conditions_And_Loops;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        // Lets see with simple if condition
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();
        if(salary > 10000){
            salary=salary+ 1000;
        }else{
            salary=salary+500;
        }
        System.out.println(salary);

        // Lets see with multiple if condition
        Scanner input1 = new Scanner(System.in);
        int salary1 = input1.nextInt();
        if(salary1 > 10000){
            salary1+= 1000;
        }else if (salary1 > 20000){
            salary1+=2000;
        }else{
            salary1+=500;
        }
        System.out.println(salary1);
    }
}

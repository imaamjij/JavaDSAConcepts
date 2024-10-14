package Conditions_And_Loops;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        // .trim() used to remove spaces  .charAt(0) takes 0th index of input

        if(ch>='a' && ch<='z'){
            System.out.println("Lowercase");
        }else{
            System.out.println("Uppercase");
        }
    }
}

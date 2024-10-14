package Conditions_And_Loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans=0;
        while(true){
            System.out.print("Enter the Operator: ");
            char ch = in.next().trim().charAt(0);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%' ){
                System.out.print("Enter two numbers: ");
                int n1 = in.nextInt();
                int n2 = in.nextInt();
                if(ch == '+'){
                    ans=n1 + n2;
                }
                if(ch == '-'){
                    ans=n1 - n2;
                }
                if(ch == '*'){
                    ans=n1 * n2;
                }
                if(ch == '/') {
                    if (n2 != 0) {
                        ans = n1 / n2;
                    }
                }
                if(ch == '%'){
                    ans=n1 % n2;
                }

            } else if( ch == 'X' || ch =='x'){
                break;
            }else{
                System.out.println("Enter valid Operator");
            }
            System.out.println(ans);
        }
    }
}

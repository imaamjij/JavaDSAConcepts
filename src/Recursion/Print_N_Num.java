package Recursion;

import java.util.Scanner;

public class Print_N_Num {
    static int count=1;
    public static void print(int n){
        if(count>n){
            return;
        }
        System.out.println(count);
        count+=1;
      print(n);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
}

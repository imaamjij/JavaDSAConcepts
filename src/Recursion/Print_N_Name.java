package Recursion;

import java.util.Scanner;

public class Print_N_Name {

    static void func(int i,int n){
        if(i>n){
            return;
        }
        System.out.println("Imaam");
        i+=1;
        func(i, n);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        func(i,n);
    }
}

package Conditions_And_Loops;

import java.util.Scanner;

public class NUm_Occurence {
    public static void main(String[] args) {
        int n = 1234535445;
        int count=0;

        while(n>0){
            int rem=n%10;
            if(rem == 3){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);

    }
}

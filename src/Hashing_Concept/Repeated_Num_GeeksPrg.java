package Hashing_Concept;

import java.util.Scanner;

public class Repeated_Num_GeeksPrg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLen= sc.nextInt();

        int arr[] = new int[arrLen];
        for(int i=0;i<arrLen;i++){
            arr[i] = sc.nextInt();
        }

//        for(int i = 0;i<arrLen;i++){
//            System.out.print(arr[i]+ " ");
//        }

        int Hash[] = new int[13];
        for(int i=0; i<arrLen;i++){
            Hash[arr[i]]++;
        }

        int num = sc.nextInt();
        for(int i = 1; i<= num ;i++) {
            System.out.print(Hash[i] + " ");
        }

    }
}

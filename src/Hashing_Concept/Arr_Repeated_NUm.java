package Hashing_Concept;

import java.util.Scanner;

public class Arr_Repeated_NUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLen = sc.nextInt();
        int[] arr = new int[arrLen];
        for(int i=0;i<arrLen;i++){
            arr[i] = sc.nextInt();
        }

        // checking array
        for(int i: arr) {
            System.out.print(i + " ");
        }

        //Using Hashing
        // Precompute Part
        // This is syntax of declaring the size of array
        int[] HashArr = new int[13];
        for (int i=0; i< arrLen;i++){
            HashArr[arr[i]] +=1;
        }

        int QueryLen = sc.nextInt();

        while(QueryLen > 0){
            int num = sc.nextInt();
            //Now fetching from PreCompute
            System.out.print(HashArr[num] + " ");
            QueryLen--;
        }


    }
}

package Sorting;

import java.util.Scanner;

public class SelectionSort {

    static void selection_sort(int arr[], int arrLen){
        for( int i = 0; i <=  arrLen-2; i++){
            int min = i;
            for( int  j = i; j <= arrLen-1; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLen = sc.nextInt();

        int arr[] = new int[arrLen];
        for(int i = 0; i < arrLen; i++){
            arr[i] = sc.nextInt();
        }

        //func for selection sort
        selection_sort(arr, arrLen);

        // For Output
        for(int i = 0; i < arrLen; i++){
            System.out.print(arr[i]+ " ");
        }

    }


}

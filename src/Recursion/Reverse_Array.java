package Recursion;

public class Reverse_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reversearray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void reversearray(int[] arr){
        int left=0;
        int right=arr.length-1;

        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}

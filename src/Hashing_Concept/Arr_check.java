package Hashing_Concept;

public class Arr_check {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3,1,5,1};
        int num=1;

        System.out.println(arrCount(num,arr));
    }
    static int arrCount(int num, int[] arr){
        int count=0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==num){
                count=count+1;
            }
        }
        return count;
    }
}
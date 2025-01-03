package Hashing_Concept;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class Arr_check {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3,1,5,1};
        int num=1;

        System.out.println(arrCount(num,arr));

        //check sort()
        Arrays.sort(arr);
        System.out.println("----");
        System.out.println(Arrays.toString(arr));
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
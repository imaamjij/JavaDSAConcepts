package Basic_Maths;

import java.util.ArrayList;
import java.util.Scanner;

public class Divisors_Num {
    public static void main(String[] args) {
        ArrayList<Integer> divisors = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 1;i<=num;i++){
            if(num%i == 0){
                divisors.add(i);
            }
        }
        System.out.println(divisors);
    }
}


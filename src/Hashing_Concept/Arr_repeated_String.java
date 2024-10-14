package Hashing_Concept;

import java.util.Scanner;

public class Arr_repeated_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        //precompute
        int[] Hash = new int[26];
        for(int i=0;i<str.length();i++){
            Hash[str.charAt(i) - 'a'] ++;
        }

        int Qry = sc.nextInt();
        while(Qry > 0){
            char ch= sc.next().charAt(0);
            //fetch
            System.out.println(Hash[ch - 'a']);
            Qry--;
        }
    }
}

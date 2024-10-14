package Hashing_Concept;

import java.util.*;

public class RepeatedStringLowerUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        //precompute
        int[] Hash = new int[256];
        for (int i = 0; i < str.length(); i++) {
            Hash[str.charAt(i)]++;
        }

        int Qry = sc.nextInt();
        while (Qry > 0) {
            char ch = sc.next().charAt(0);
            //fetch
            System.out.println(Hash[ch]);
            Qry--;
        }
    }
}

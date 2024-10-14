package Recursion;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the cleaned string is a palindrome
        int left = 0;
        int right = cleanedString.length() - 1;

        while (left < right) {
            if (cleanedString.charAt(left) != cleanedString.charAt(right))
            {
                return false;
            }
            left++;
            right--;

        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean isPalindrome= isPalindrome(s);
        System.out.println(isPalindrome);

    }
}

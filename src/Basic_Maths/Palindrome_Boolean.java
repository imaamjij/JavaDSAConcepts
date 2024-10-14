package Basic_Maths;


class Palindrome_Boolean {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        while (x > reversed) {
            int rem = x % 10;
            x /= 10;
            reversed = reversed * 10 + rem;
        }

        return x == reversed || x == reversed / 10;
    }

}

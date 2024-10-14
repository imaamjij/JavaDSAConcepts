package Recursion;

public class Fact_N {
    public static void main(String[] args) {
        fact(5);
    }

    static void fact(int n){
        if(n==0){
            System.out.println(1);
        }else {

            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println(factorial);
        }
    }

}

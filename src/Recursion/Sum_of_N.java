package Recursion;

public class Sum_of_N {
    public static void main(String[] args) {
        solve(6);
    }

    static void solve(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}

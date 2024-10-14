package Recursion;

public class Print_Nto1 {
    static void func(int i,int n){
        if(i==0){
            return;
        }
        System.out.println(i);
        i--;
        func(i,n);
    }

    public static void main(String[] args) {
        int n=5;
        int i=n;
        func(i,n);

    }
}

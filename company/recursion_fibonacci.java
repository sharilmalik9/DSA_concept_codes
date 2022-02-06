package com.company;

public class recursion_fibonacci {
    static int fib(int n ){
        if(n<=1){
            return n ;

        }
        int term1=fib(n-1);
        int term2= fib(n-2);
        return term1+term2;
    }
    public static void main(String[] args) {
        System.out.println(fib(4));

    }
}

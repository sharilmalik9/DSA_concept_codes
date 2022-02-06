package com.company;

public class factorial_recursion {
    static int fact(int n){
        if (n==0){
            return 1;

        }
        int sp= fact(n-1);
        return sp*n;
    }
    public static void main(String[] args) {
        System.out.println(fact(4));

    }
}

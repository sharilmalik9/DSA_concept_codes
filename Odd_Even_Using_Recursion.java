package com.company;
import java.util.Scanner;
//Take as input N, a number. Print odd numbers in decreasing sequence (up until 0) and even numbers in increasing sequence (up until N) using Recursion

public class Odd_Even_Using_Recursion {
    static void di(int n ){
        if(n==0){
            return;
        }
        if(!(n%2==0)){
            System.out.println(n);
        }
        di(n-1);
        if(n%2==0){
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        di(n);
    }
}

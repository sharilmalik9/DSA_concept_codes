package com.company;
import java.util.Scanner;

public class recursion_pattern_inverted_triangle {
    static void triangle(int limit){
        if(limit==0){
            return;
        }
        for(int i =1;i<=limit;i++){
            System.out.print("*\t");
        }
        System.out.println();
        triangle(limit-1);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int limit=sc.nextInt();
        triangle(limit);
    }
}

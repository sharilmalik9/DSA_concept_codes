package com.company;
import java.util.Scanner;


public class Recursion_Pattern__triangle {
    static void pattern(int n,int present ){
        if(present==n+1){
            return;
        }
        for(int i=1;i<=present;i++){
            System.out.print("*\t");
        }
        System.out.println();
        pattern(n,present+1);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int limit=sc.nextInt();
        pattern(limit,1);

    }
}

package com.company;
//Take as input N, a number. Write a recursive function to find Nth triangle where 1st triangle is 1, 2nd triangle is 1 + 2 = 3, 3rd triangle is 1 + 2 + 3 = 6, so on and so forth. Print the value returned.
import java.util.Scanner;
public class sum_recursion {
    static void sumr(int limit,int sum,int present){
        if(present>limit){
            if(present==limit+1) {             // so that it adds the last element as well
                System.out.println(sum);
            }
            return;
        }

        sumr(limit,sum+present,present+1);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int no=sc.nextInt();



        sumr(no,0,0);
    }

}

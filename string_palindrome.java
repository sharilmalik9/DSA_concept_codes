package com.company;
import java.util.Scanner;

public class string_palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // int count=0;
        String str=sc.next();
        int count=0;
        for(int i=0;i<=(str.length()/2)-1;i++){
            char first=str.charAt(i);
            char last=str.charAt(str.length()-1-i);
            if(last==first){
                count+=1;
            }
            else{
                break;
            }





        }
        if (count==str.length()/2){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }


    }
}

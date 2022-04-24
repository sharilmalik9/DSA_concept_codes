package com.company;
import java.util.Scanner;

public class Recursion_Convert_String_to_Integer {
    static void convert(String str,int ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char i=str.charAt(0);
        convert(str.substring(1),ans*10+(i-'0'));
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String str=sc.next();
        convert(str,0);
    }
}


package com.company;
import java.util.Scanner;
import java.util.*;



public class trial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your string :");
        StringBuilder sc1=new StringBuilder(String.valueOf(sc)); //this is string builder
        sc1=sc1.replace(3,4, "hello");

        

//        String name=sc.nextLine();
//        System.out.println(name.length());
//        System.out.println(name.substring(2,4));
//        System.out.println(name.charAt(6));
        System.out.println(sc1);






    }

}

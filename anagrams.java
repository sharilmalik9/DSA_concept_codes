package com.company;
import java.util.Locale;
import java.util.Scanner;

public class anagrams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a =sc.next();
        String b =sc.next();
        int count=0;
        int hash=0;
        int length=0;
        a=a.toLowerCase();
        b=b.toLowerCase();
        if(a.length()>b.length()){
            length=b.length();

        }
        else{
            length=a.length();
        }
        for(char c='a';c<='z';c++) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == c) {
                    count++;
                }
            }
            for (int j = 0; j < b.length(); j++) {


                    if (b.charAt(j) == c) {
                        count--;
                    }
                }


            if (count != 0) {
                System.out.println("Not Anagrams");
                break;
            } else {
                hash += 1;
            }
        }

        if(hash==26){
            System.out.println("Anagrams");

        }








    }
}

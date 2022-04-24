package com.company;
import java.util.Scanner;

//Take as input str, a string. Write a recursive function which returns a new string in
// which all duplicate consecutive characters are separated by a ‘ * ’. E.g. for “hello”
// return “hel*lo”. Print the value returned

public class Recursion_Duplicate_character_formatting {
    static void charf(String str,int index,String ans) {
        if (index >= str.length()) {
            if (index == str.length()) {
                System.out.println(ans)
                ;
                return;
            }

            return;
        }
        if (index != 0) {

            if (str.charAt(index) == str.charAt(index - 1)) {

                charf(str, index+1, ans+"*"+str.charAt(index));
               // System.out.println(ans);


            }
            else{
               charf(str,index+1,ans+str.charAt(index));
            }

        }
        else{

           charf(str,index+1,ans+str.charAt(index));
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.next();
        charf(str,0,"");
    }
}

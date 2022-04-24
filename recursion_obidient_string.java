package com.company;
import java.util.ArrayList;
import java.util.*;
//Take as input str, a string. Write a recursive function that checks if the string was
// generated using the following rules and returns a Boolean value: a. the string begins with an
// 'a' b. each 'a' is followed by nothing or an 'a' or "bb" c. each "bb" is followed by nothing
// or an 'a' Print the value returned.

public class recursion_obidient_string {
    static void strcheck(String ans, String str, ArrayList<String> ab){
        if(ans.length()>=str.length()){
          //  System.out.println(ans);

            int abc=str.compareTo(ans);
            if(ans.length()==str.length()){
                if(abc==0){
                    ab.add(ans);
                    return ;
                }




            }
            return ;

        }
        // a included
        strcheck(ans+"a",str,ab);
        // a is not included
        strcheck(ans+"abb",str,ab);




    }





    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> arr= new ArrayList<>();

        strcheck("",str,arr);
        if(arr.isEmpty()){
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }
       // System.out.println(ab);

    }

}

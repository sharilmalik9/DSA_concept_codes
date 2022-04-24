package com.company;
import java.util.*;
//Take as input str, a string. A “twin” is defined as two instances of a char separated by a char.
// E.g. "AxA" the A's make a “twin”. “twins” can overlap, so "AxAxA" contains 3 “twins” -
// 2 for A and 1 for x. Write a function which recursively counts number of “twins” in a string.
// Print the value returned.

public class recursion_twins {
    public static int count=0;
    static void twins(String str, int twin, int index,List<Integer> arr) {
        if (index == str.length()-1) {
            arr.add(twin);






            return;


        }
        if(index>str.length()-1){
            return;
        }

        if(index<=str.length()-3) {

            if (str.charAt(index) == str.charAt(index + 2)) {



                twins(str, twin + 1, index + 1,arr);

            }
            twins(str, twin , index + 1,arr);
        }
        else {

               twins(str, twin, index + 1,arr);
            }





    }

    public static void main(String[] args) {
        int index = 0;
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        List<Integer> arr=new ArrayList<>();
        //  twins("AXAXA",index,0);
        twins(str, index, 0,arr);
      //  System.out.println(count);
        System.out.println(arr.get(0));

    }

}


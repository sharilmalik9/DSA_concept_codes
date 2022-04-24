package com.company;
import java.util.*;

public class tower_of_hanoi {
    static List<Integer> A = new ArrayList<>();
    static List<Integer> B = new ArrayList<>();
    static List<Integer> C = new ArrayList<>();
    static void toh(int n, char src,char dest,char help){
        if(n==0){
            return;
        }
        toh(n-1,src,help,dest);

        System.out.println("Moving ring "+n+" from " +src+" to "+dest);
        toh(n-1,help,dest,src);
    }
    //using arraylist
    static void TOH(int n, List<Integer> src, List<Integer> dest, List<Integer> helper) {
        if (n == 0) {
            return;
        }
        // A  B C are global variable
        TOH(n - 1, src, helper, dest);
//		Here i was shifting nth disk from src to dest.
        int LOL = src.remove(src.size() - 1);
        dest.add(LOL);

        System.out.println(A + "\t" + B + "\t" + C);
        TOH(n - 1, helper, dest, src);
    }

    public static void main(String[] args) {
        toh(10,'a','c','b');
       // TOH(3, A, C, B); // for arraylist

    }
}



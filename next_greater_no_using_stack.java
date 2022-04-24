package com.company;
import java.util.Scanner;
import java.util.Stack;

public class next_greater_no_using_stack {
    static void nextgr8(int[] arr){
        Stack<Integer> st= new Stack<>();
        for(int i:arr) {
            // using peek top element always being compared
            while (!st.isEmpty() && st.peek() < i) {

                System.out.println(st.pop() + "<=" + i);
            }

            st.push(i);
        }



        // for elements still in st and dont have a no greater than
        // give -1 in that case
        while(!st.isEmpty()) {
            System.out.println(st.pop() + " >= " + "-1");
        }
        }




    public static void main(String[] args) {
        int[] arr={50,30,20,40,10,45,5,60};
        nextgr8(arr);
    }

}

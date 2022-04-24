package com.company;
import java.util.Scanner;
import java.util.Stack;


public class stack_basic_ques {
    static void stackrev(Stack<Integer> s,Stack<Integer> helper ){
        if(helper.isEmpty()){
            return;

        }
       // copy(s,helper);
        int ali=helper.pop();
        s.add(ali);
        stackrev(s,helper);







    }
    static void copy(Stack<Integer> s,Stack<Integer> helper ){
        if(s.isEmpty()){
            return;
        }
        int ali=s.pop();
        copy(s,helper);
        helper.add(ali);
    }
    static void printrev(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int ali=s.pop();
        printrev(s);
        System.out.println(ali);
        s.add(ali); // explicit backtracking
        // so that stack does not get empty






    }


    public static void main(String[] args) {
        Stack<Integer> s =new Stack<>();
        Stack<Integer> helper=new Stack<>();
        s.add(10);
        s.add(20);
        s.add(30);
        System.out.println(s); // this func prints it like an array and u cannot extract first element
        // without removing others

        printrev(s);
        copy(s,helper);
        System.out.println(helper);
        stackrev(s,helper);

        System.out.println(s);



    }
}

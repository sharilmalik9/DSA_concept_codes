package com.company;
// given n no of closing and opening bracket find the valid pairs that can be made with them
public class closing_opening_bracket {
    static void bracket(int co,int cc,String sol ){
        if(co==0&&cc==0){
            System.out.println(sol);
            return;
        }
        if(cc>co){
            return;
        }
        if(co>0){
            bracket(co-1,cc,sol+"(");
        }
        if(cc>0){
            bracket(co,cc-1,sol+")");



        }

    }

    public static void main(String[] args) {

        bracket(2,2,"");

    }

}

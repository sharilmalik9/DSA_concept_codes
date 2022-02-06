package com.company;

public class jumping_no_recursion {
    static void jumpingno(int limit,int current){
        if(current>limit){
            return;
        }
        System.out.println(current);
        int digit=current%10;
        if(digit>0) {
            jumpingno(limit, current * 10 +(digit-1) );

        }
        if(digit<9) {
            jumpingno(limit, current * 10 + (digit+1));
        }


    }

    public static void main(String[] args) {
        for(int i=1;i<=9;i++) {
            jumpingno(100,i);
        }
    }
}

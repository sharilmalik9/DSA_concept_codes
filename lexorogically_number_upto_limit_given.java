package com.company;

public class lexorogically_number_upto_limit_given {
    static void lexo(int limit,int start){
        if(start>limit){

            return;
        }
        System.out.println(start);
        int i=0;
        if(start==0){
            i=1;
        }
        for(;i<=9;i++){
            lexo(limit,start*10+i);
        }

    }

    public static void main(String[] args) {
        for(int i=1;i<=9;i++) {
            lexo(100,i);
        }
    }
}

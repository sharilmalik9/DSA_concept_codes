package com.company;

public class recursion_basic_questions {
    //PI
    static void PI(int n){
        if(n==0){
            return;
        }
        PI(n-1);
        System.out.println(n);
    }


    // PD
    static void PD(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        PD(n-1);
    }
    static void PDI(int n ){
        if(n==0){
            return;
        }
        System.out.println(n);
        PDI(n-1);
        System.out.println(n);
    }
    static void PID(int n,int p ){

        if(n==p){
            return;

        }
        System.out.println(n);
        PID(n+1,p);
        System.out.println(n);

    }

    public static void main(String[] args) {
        PI(4);
        System.out.println("/////////////");
        PD(4);
        PDI(4);
        System.out.println("//////////////");
        PID(1,5);




    }
}

package com.company;

public class english_ruller_recursion {
    static void engruller(int major, int len){
        for(int i=0;i<len;i++){
            for (int j =1; j<=major; j++){
                System.out.print("-");
            }
            System.out.println(i);
            pattern(major-1);
        }
        for(int i=1; i<=major;i++){
            System.out.print("-");
        }
        System.out.println(len);

    }

    static void pattern(int tic ){
        if (tic==0){
            return;
        }
        else{
            pattern(tic-1);
            for(int i=1; i<=tic;i++){
                System.out.print("-");
            }
        }
        System.out.println();
        pattern(tic-1);

    }
    public static void main(String[] args) {
        engruller(3,4);

    }
}

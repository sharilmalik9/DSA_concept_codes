package com.company;


public class Main {
    public static int calpower(int x, int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(n%2==0) {


            int powernm1 = calpower(x, n/2)*calpower(x,n/2);
            return powernm1;
        }
        else{
            int powernm1 = calpower(x, n/2)*calpower(x,n/2)*x;
            return powernm1;

        }

    }

    public static void main(String[] args) {
	int m = calpower(2,5);
        System.out.println(m);
    }


}

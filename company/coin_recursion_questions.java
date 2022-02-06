package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class coin_recursion_questions {
    //unique answers and infinite supply
    static void coin_c1(int[] coin,int ans1,int idx,int sum,String ans){
        if(ans1==sum){
            System.out.println(ans);
              return;
        }

        if(ans1>sum ||idx>=coin.length){
            return;

        }
        // ans m add ho
        coin_c1(coin,ans1+coin[idx],idx,sum,ans+coin[idx]); // include and use again
        // ans m add na ho
        coin_c1(coin,ans1,idx+1,sum,ans); // not included move to next coin

    }
    // case -2
    // unique ans but finite coins (every coin can be used only one)
    static void coin_c2(int[] coin,int ans1,int idx,int sum,String ans){
        if(ans1==sum){
            System.out.println(ans);
            return;
        }

        if(ans1>sum ||idx>=coin.length){
            return;

        }
        // ans m add ho
        // always move to next coin
        coin_c2(coin,ans1+coin[idx],idx+1,sum,ans+coin[idx]); // include and  not use again
        // ans m add na ho
        coin_c2(coin,ans1,idx+1,sum,ans); // not included move to next coin

    }

    // finite supply and duplicate no in the array but find unique answers only
    //sort the list before using
    static void coin_c3(int[] coin,int ans1,int idx,int sum,String ans,Boolean call){
        if(ans1==sum){
            System.out.println(ans);
            return;
        }

        if(ans1>sum ||idx>=coin.length){
            return;

        }
        //include calls
        // if prev element same then check  if exclude call was made or not for prev elemet
        //if made then dont make a include call
        // if not made then make a call for include
        if(idx>0&&coin[idx]==coin[idx-1]&&call) {
            coin_c3(coin, ans1 + coin[idx], idx+1, sum, ans + coin[idx],true);
        }
        // for all other cases if element are not same then it has no condition
        // 0 taken idx-1 will not cause out of bound error
        if(idx==0||coin[idx]!=coin[idx-1]){
            coin_c3(coin, ans1 + coin[idx], idx+1, sum, ans + coin[idx],true);

        }
        // making it false because it exluded case has been taken then cant make include call for same element

        coin_c3(coin,ans1,idx+1,sum,ans,false); // exclude always made

    }

    public static void main(String[] args) {
       int[] coin={1,1,2,3,};
       // here i am taking already sorted list u can sort accordingly

        coin_c3(coin,0,0,5,"",true);
        // u can take anything in first
        //true or false


    }

}

package com.company;
//climb stairs n with 1, 2 steps allowed


import java.util.*;

public class climb_stairs {
    static void climb(int stair,String ans1 ,int ans, ArrayList<String> al){
        if(stair<=0){
                if(stair==0) {
                    al.add(ans1);
                   // System.out.println(ans1);
                }

            return;

        }

        climb(stair-1,ans1+"1",ans+1,al);

        climb(stair-2,ans+"2",ans+2,al);



    }
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        climb(n,"",0,al);
        System.out.println(al.size());

    }
}

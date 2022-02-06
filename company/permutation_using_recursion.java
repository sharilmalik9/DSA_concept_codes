package com.company;

public class permutation_using_recursion {
    static void perm(String str, String ans){
        if(str.isEmpty()){
            System.out.println(ans);
        }
        for(int i=0;i<str.length();i++){
            String sub=str.substring(0,i)+str.substring(i+1);
            perm(sub,ans+str.charAt(i));
        }
    }

    public static void main(String[] args) {
        perm("abc","");
    }
}

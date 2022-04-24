package com.company;
// in a simple way
public class recursive_tree_substring {
    static void substr(String str, String ans){
        if(str==""){
            System.out.println(ans);
            return;
        }
        //include
        char char1=str.charAt(0);
        substr(str.substring(1),ans+char1);
        //exclude
        substr(str.substring(1),ans);
    }
// same ques but print ans lexographically

    public static void main(String[] args) {
        substr("abc","");
    }
}

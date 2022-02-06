package com.company;
import java.util.*;

public class palindrome_partiononing {
    static void palinpar(String str,ArrayList<String> al){
        if(str.isEmpty()){
            System.out.println(al);
        }
        for(int i=1;i<=str.length();i++){
            String chopped=str.substring(0,i);
            if(ispalin(chopped)) {
                al.add(chopped);
                palinpar(str.substring(i), al);
                al.remove(al.size() - 1);
            }
        }

    }
    static boolean ispalin(String str){
        int count=0;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)==str.charAt(str.length()-1-i)){
                count++;
            }
            else{
                break;
            }


        }
        boolean ans =true;
        if(count==str.length()/2){
            ans=true;

        }
        else{
            ans=false;
        }
        return ans;
    }


    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        palinpar("nitin",al);


    }
}

package com.company;
import java.util.*;

public class string_token {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
      //  System.out.println(str);
        String ans ="";
        ArrayList<String> arr1=new ArrayList<>();
        for(int i=0;i<str.length();i++) {
           // System.out.println(str.charAt(i));
            if (i==str.length()-1||str.charAt(i) == ' ' || str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == '?' || str.charAt(i) == '.' || str.charAt(i) == '_' || str.charAt(i) == '@' || str.charAt(i) == '\'') {
                //System.out.println(ans);
                if(ans.length()!=0) {
                    arr1.add(ans);
                 //  System.out.println(ans);
                    ans = "";
                }
            }
            else{
                ans+=str.charAt(i);
                //System.out.println(ans);

            }
        }
        System.out.println(arr1.size());
        for(String i:arr1){
            System.out.println(i);
        }


    }

}

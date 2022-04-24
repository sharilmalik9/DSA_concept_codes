package com.company;
import java.sql.Array;
import java.util.Scanner;

//Find all the subsets of a given array that sum to k.
//Sets with least no of elements should be printed first.
//For equal length, elements that appear later in the original set,should be printed first.

public class subsets_sum_equal_to_a_No {
    static void subsets(String str,String ans,int total) {
        if (str.isEmpty()) {
            int sum=0;
            for(int i=ans.length()-1;i>=0;i--){  // kese bhi krlo aage se ya pichhe se
                sum+=ans.charAt(i)-'0';

            }
            if(sum==total){
                for(int i=ans.length()-1;i>=0;i--){     // backloop cause submission wanted
                    System.out.print(ans.charAt(i)+" ");
                    sum=0;
                }
                System.out.println();
            }


            return;
        }


      //exclude
        subsets(str.substring(1),ans,total);
        //include
        subsets(str.substring(1),ans+str.charAt(0),total);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int limit=sc.nextInt();
        int[] arr=new int[limit];
        for(int i=0;i<limit;i++){
            int no=sc.nextInt();
            arr[i]=no;
        }
        String str="";
        for(int i:arr){
            str+=i;

        }
        int total=sc.nextInt();


        subsets(str,"",total);
    }
}

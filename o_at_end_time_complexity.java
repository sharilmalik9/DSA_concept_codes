package com.company;
// imp
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
// working-

// first find for vacant places if value is not equal to zero that place can be considered
// then forget 0 place


public class o_at_end_time_complexity {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int[] arr=new int[no];

        for(int i=0;i<no;i++){
            int value=sc.nextInt();
            arr[i]=value;


        }

        int count=0;
        for(int i :arr){
            // check for elements
            if(i!=0){
                arr[count]=i;
                // if zero not there then keep puting values
                // this is basically rarranging the array
                count++;
            }
        }



       // length-count shall be filled be zeroes from last
        for(int i =count ; i<no;i++){

            arr[i]=0;
        }
        System.out.println(Arrays.toString(arr)); // to print arr easily in one step








    }

}

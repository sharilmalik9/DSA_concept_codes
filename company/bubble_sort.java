package com.company;
import java.util.*;

public class bubble_sort {

    static void swap(int first, int next){
        int element = first;
        first = next;
        next =element;
    }
    public static void main(String[] args) {
       int[] arr={2,5,3,4,6,7,0};



        int l =arr.length;
        for (int i =0;i<l;i++){
        //    boolean swapped=false;
            for(int j =0; j<l-i-1;j++) {
                if (arr[j + 1] < arr[j]) {
                    swap(arr[j], arr[j + 1]);


                }
            }


        }
        for (int i:arr) {


            System.out.print(i +" ");
        }

    }
}

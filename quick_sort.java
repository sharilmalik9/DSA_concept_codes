package com.company;

import java.util.Arrays;

public class quick_sort {
    static void quick_sort(int[] arr,int s,int e){
        if(s>=e){


            return;
        }


        int pivot=arr[(s+e)/2];

        int left=s;
        int right=e;
        while(left<right) {
            while(arr[left] < pivot) {

                left++;
            }
            while (arr[right] > pivot) {
                right--;
            }

//
              if(left<right) {
                  int temp = arr[left];
                  arr[left] = arr[right];
                  arr[right] = temp;
              }

        }


        quick_sort(arr,s,right-1);

        if(s!=left){
            quick_sort(arr,left,e);
        }
        else{
            quick_sort(arr,left+1,e);
        }
    }

    public static void main(String[] args) {
        int[] arr={10,90,70,24,100};

        quick_sort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

}

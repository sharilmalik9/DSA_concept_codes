package com.company;

import java.util.Arrays;

public class merge_sort {
    // given 2 sorted arrays now merge them and form a sorted array
    // logic- same as finding common element
    static int [] merge_sort(int[] arr1, int[] arr2){
        int[] arrf= new int[arr1.length+arr2.length];
        int idx1=0;
        int idx2=0;
        int idx3=0;
        while(idx1<arr1.length && idx2<arr2.length) {
            if (arr1[idx1] > arr2[idx2]) {
                arrf[idx3] = arr2[idx2];
                idx2++;
                idx3++;
            }
            else if(arr1[idx1] < arr2[idx2]){
                arrf[idx3] = arr1[idx1];
                idx3++;
                idx1++;

            }
            else{   // if same element appears
                arrf[idx3]=arr1[idx1];
                idx3++;
                idx1++;
                arrf[idx3]=arr2[idx2];
                idx3++;
                idx2++;


            }
        }
        if(idx1<arr1.length){
            arrf[idx3]=arr1[idx1];
            idx1++;
            idx3++;
        }
        if(idx2<arr2.length){
            arrf[idx3]=arr2[idx2];
            idx2++;
            idx3++;
        }
        return arrf;

    }
    // merge sort with non-sorted lists given
     static int[] sort(int[] arr,int s,int e){
        if(s==e){
            int[] ans=new int[1];
            ans[0]=arr[e];
            return ans;
        }
        int mid=(s+e)/2;
        int[] left=sort(arr,s,mid); // ans being taken here
        int[] right=sort(arr,mid+1,e);
        return merge_sort(left,right);


     }

    public static void main(String[] args) {
//        int[] arr1={1,4,5,6,7,10,55,100};
//        int[] arr2={1,2,3,4,5,6,77};
//        int[] arrf= new int[arr1.length+arr2.length];
//        merge_sort(arr1,arr2,arrf);
//        for(int i:arrf){
//            System.out.print(i+" ");
//        }
        int[] arr={2,3,4,0,3,1,4};
        System.out.println(Arrays.toString(sort(arr,0,arr.length-1)));

    }
}

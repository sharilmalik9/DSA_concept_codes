package com.company;
// print the intersected array


import java.util.ArrayList;

public class intersection_of_array {
    public static void main(String[] args) {
        int[] arr={2,3,7,8,10,33,45};
        int[] arr1={1,2,3,5,8,22,45};
        int ind1=0;
        int ind2=0;
        ArrayList<Integer> l=new ArrayList<>();
        while(ind1<arr.length && ind2< arr1.length){
            if(arr[ind1]==arr1[ind2]){
                l.add(arr[ind1]);
                ind1++;
                ind2++;

            }
            else if (arr[ind1]>arr1[ind2]){
                ind2++;
            }
            else{
                ind1++;
            }

        }
        System.out.println(l);

    }
}

package com.company;
import java.util.*;

public class Array_intersection_hash_map {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        int[] arr1 = { 30, 20, 40, 50, 70, 30, 20, 20, 50, 50 };
        int[] arr2 = { 50, 80, 30, 20, 20, 20, 90, 50, 20 };
        for(int i=0;i< arr1.length;i++){
            if (hash.containsKey(arr1[i])) {
                // to increase freq
                int prev_idx=hash.get(arr1[i]);
                hash.put(arr1[i],prev_idx+1);
            }
            else{
                hash.put(arr1[i],1);
            }
        }
        System.out.println(hash);
        for(int i=0;i<arr2.length;i++){
            if(hash.containsKey(arr2[i])&& hash.get(arr2[i])>0){
                System.out.println(arr2[i]);
                // after intersection is met now decrease one freq
                int prev_idx=hash.get(arr1[i]);
                hash.put(arr1[i],prev_idx-1);

            }
        }
        System.out.println(hash);

    }
}

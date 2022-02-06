package com.company;
// add elements of 2 arr carry one should go to next element

import javax.swing.*;
import java.util.*;

public class addition_of_arrays_carry {

         static ArrayList<Integer> Add(int[] arr1, int[] arr2) {
            int idx1 = arr1.length - 1;
            int idx2 = arr2.length - 1;
            int carr = 0;
            ArrayList<Integer> ans = new ArrayList<Integer>();
            while (idx1 >= 0 || idx2 >= 0 ||carr>0) {
//			int sum = arr1[idx1]+arr2[idx2]+carr;
                int sum = carr;
                if (idx1 >= 0) {
                    sum = sum + arr1[idx1];
                }
                if (idx2 >= 0) {
                    sum = sum + arr2[idx2];
                }
                int digit = sum % 10;
                carr = sum / 10;
                ans.add(digit);
                idx1--;
                idx2--;


            }
//		System.out.println(ans);
            Collections.reverse(ans);
            return ans;

        }

    public static void main(String[] args) {
       int[] arr1={10,20,6,8};
       int[] arr2={5,6,7};
        System.out.println(Add(arr1,arr2));
    }




}

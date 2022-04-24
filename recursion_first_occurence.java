package com.company;
import java.util.*;

public class recursion_first_occurence {
    static void firstocc(int element,int[] arr,int idx,ArrayList<Integer> arr1) {
        if (idx==0) {


            return ;
        }
        firstocc(element,arr,idx-1,arr1);
        if(arr[idx]==element){
            arr1.add(idx);
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int limit=sc.nextInt();
        if(limit!=0) {
            int[] arr = new int[limit];
            for (int i = 0; i < limit; i++) {
                int var = sc.nextInt();
                arr[i] = var;

            }

            int element = sc.nextInt();
            ArrayList<Integer> arr1 = new ArrayList<>();
            firstocc(element, arr, limit - 1, arr1);
            if (arr1.isEmpty()) {
                System.out.println(-1);
            } else {
                System.out.println(arr1.get(arr1.size()-1));
            }
        }
        else{
            System.out.println(0);
        }

    }
}

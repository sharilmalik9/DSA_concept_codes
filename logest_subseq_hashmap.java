package com.company;
import java.util.*;
// out of an array find the longest array having consecutive elements

public class logest_subseq_hashmap {
    public static void main(String[] args) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        int[] arr = {2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6};
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i] - 1)) {
                map.put(arr[i], false);
            } else {
                map.put(arr[i], true);

            }
            if (map.containsKey(arr[i] + 1)) {
                map.put(arr[i] + 1, false);

            }

        }
        for(int key:map.keySet()){
            if(map.get(key)){
                System.out.println(key+"this is start");
                int temp=key;
                while(map.containsKey(temp)){
                    System.out.print(temp+" ");
                    temp++;
                }
                System.out.println();
            }
        }

    }
}


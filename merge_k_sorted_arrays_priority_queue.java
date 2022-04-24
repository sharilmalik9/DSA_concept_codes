package com.company;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class merge_k_sorted_arrays_priority_queue {
    static class pair implements Comparable<pair> {
        int data;
        int arr_idx;
        int ele_idx;
        public  pair(int d,int c,int p) {
            data = d;
            arr_idx = c;
            ele_idx = p;
        }
        // to make it clear thar pair has comparable quantities so make compare methods
            @Override
        public int compareTo(pair o) {
            // to rank wise setting
                // small to big will be arranged by heap/ priority queue now
                //
            return this.data-o.data;
        }
    }
    static void mergeksorted(ArrayList<ArrayList<Integer>> arr){
        PriorityQueue<pair> PQ= new PriorityQueue<>();
        // first add pair of first elements of all arrays
        for (int i = 0; i < arr.size(); i++) {
            PQ.add(new pair(arr.get(i).get(0), i, 0));
        }
        // now start getting smallest ones from pq and adding their next element in their place in pq
        // pq auto sorts you can keep adding and removing
        // time complexity nlogk
        while (!PQ.isEmpty()) {
            pair curr = PQ.poll();
            System.out.println(curr.data);
            if(curr.ele_idx+1==arr.get(curr.arr_idx).size()) {
                continue;
            }
            pair pp = new pair(arr.get(curr.arr_idx).get(curr.ele_idx + 1), curr.arr_idx, curr.ele_idx+1);
            PQ.add(pp);
        }

    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> AL= new ArrayList<>();
        AL.add(new ArrayList<Integer>());
        AL.get(0).add(10);
        AL.get(0).add(20);
        AL.get(0).add(30);

        AL.add(new ArrayList<Integer>());
        AL.get(1).add(15);
        AL.get(1).add(35);

        AL.add(new ArrayList<Integer>());
        AL.get(2).add(5);
        AL.get(2).add(7);
        AL.get(2).add(12);
        AL.get(2).add(25);

        AL.add(new ArrayList<Integer>());
        AL.get(3).add(17);
        AL.get(3).add(22);
        AL.get(3).add(40);


        mergeksorted(AL);


    }
}

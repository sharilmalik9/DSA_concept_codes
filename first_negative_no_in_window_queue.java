package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class first_negative_no_in_window_queue {
    static void firstn(int[] arr,int k) {
        int j = 0;
        // queue is interface u canot create its instance
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                q.add(i);
            }
        }
        while (j+k<=arr.length) {
            for (int i = j; i < j + k; i++) {
                if (q.peek() == j) {

                    //display
                    System.out.println(j+1+"group >="+arr[q.peek()]);
                    q.poll();
                    j++;
                    break;

                }
                if (q.peek() == i) {
                    //display
                    System.out.println(j+1+"group >="+arr[q.peek()]);
                    j++;

                    break;

                }
                else{
                    System.out.println("doesnt exist");
                    j++;
                    break;
                }


            }


        }
    }

    public static void main(String[] args) {
        int[] arr={-20,10,5,4,6,-9,-80,60,50};
        firstn(arr,3);
    }

}

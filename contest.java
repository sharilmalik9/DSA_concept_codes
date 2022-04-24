package com.company;
import java.util.*;

public class contest{

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();


        while (t > 0) {
            int n = scn.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < arr.length; i++){
                arr[i] = scn.nextInt();

                nextLarger(arr);

                t--;
            }
        }

    }

    // Function to print Next Greater Element for each element of the array
    static void nextLarger(int[] arr) {

        Stack<Integer> st= new Stack<>();
        for(int i:arr) {
            // using peek top element always being compared
            while (!st.isEmpty() && st.peek() < i) {

                System.out.println(st.pop() + "," + i);
            }

            st.push(i);
        }



        // for elements still in st and dont have a no greater than
        // give -1 in that case
        while(!st.isEmpty()) {
            System.out.println(st.pop() + "," + "-1");
        }





    }
}

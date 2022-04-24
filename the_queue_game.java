package com.company;
import java.util.*;
//The Game is as follows You have given a binary array, where 1 denotes push
// operation and 0 denotes a pop operation in a queue. The task is to check if the possible set
// of operations are valid or not. Print Valid if the set of Operations are Valid Otherwise Print Invalid.
public class the_queue_game {
    static void game(int[] arr){
        Queue<Integer> q= new LinkedList<>();
        try{
        for(int i:arr) {

            if (i == 0) {
                // poll method returns null if no element in queue
                // and int is primitive it will not take null as its value and will throw exceptions
                // so this will go to catch block
               int element= q.poll();
            }
            else {
                q.add(i);
            }
        }
            System.out.println("Valid");
        }

        catch(Exception e) {
                System.out.println("Invalid");
            }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int testcase=sc.nextInt();
        for(int i=1;i<=testcase;i++){
            int limit= sc.nextInt();
            int[] arr=new int[limit];
            for(int j=0;j<limit;j++){
                int element=sc.nextInt();
                arr[j]=element;

            }
            game(arr);

        }
    }








}

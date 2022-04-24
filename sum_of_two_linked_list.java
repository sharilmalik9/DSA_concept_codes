package com.company;
import java.util.*;
//Given two numbers represented by two linked lists, write a program that prints the sum list.
// The sum list is linked list representation of addition of two input numbers in linked lists.
// It is not allowed to modify the lists. Also, not allowed to use explicit extra space (Use Recursion).
//  Input Format
// First line contains N,M, number of nodes in the 1st and 2nd list.
// Next line contains N nodes of 1st list.
// Next line contains M nodes of 2nd list.
public class sum_of_two_linked_list {
    static ArrayList<Integer> sum_of_LL(LinkedList<Integer> arr1,LinkedList<Integer> arr2){
        ArrayList<Integer> sum=new ArrayList<>();
        int flag=0;
        int singledigit=0;
        int limit=Math.max(arr1.size(),arr2.size());

        for(int i=0;i<limit;i++){

            if(arr1.size()!=0 && arr2.size()!=0) {
                flag += arr1.getLast() + arr2.getLast();

                arr1.removeLast();
                arr2.removeLast();

                singledigit = flag % 10;

                flag = flag / 10;

                sum.add(singledigit);

                singledigit=0;

            }
            else if(arr1.size()!=0&&arr2.size()==0){
                flag += arr1.getLast();
                arr1.removeLast();
                singledigit = flag % 10;
                flag = flag / 10;
                sum.add(singledigit);
                singledigit=0;

            }
            else if(arr2.size()!=0&&arr1.size()==0){
                flag +=  arr2.getLast();

                arr2.removeLast();
                singledigit = flag % 10;
                flag = flag / 10;
               sum.add(singledigit);
                singledigit=0;
            }

        }
        while(flag!=0){
            singledigit=flag%10;
            flag=flag/10;
            sum.add(singledigit);
            singledigit=0;
        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int limit1=sc.nextInt();
        int limit2=sc.nextInt();
        LinkedList<Integer> arr1= new LinkedList<>();

        LinkedList<Integer> arr2= new LinkedList<>();
        int element =0;
        for(int i=0;i<limit1;i++){
            element=sc.nextInt();
            arr1.add(element);

        }
        for(int i=0;i<limit2;i++){
            element=sc.nextInt();
            arr2.add(element);

        }
        ArrayList<Integer> sum= new ArrayList<>();
        sum=sum_of_LL(arr1,arr2);
        for(int i=sum.size()-1;i>=0;i--){
            System.out.print(sum.get(i)+" ");
        }


    }
}

package com.company;
import java.util.Scanner;
public class Squares_of_a_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int[] arr=new int[no];

        for(int i=0;i<no;i++){
            int value=sc.nextInt();
            arr[i]=value;


        }
        for(int i=0;i<no;i++){
            arr[i]*=arr[i];

        }
        for (int i =0;i<no;i++){

            for(int j =0; j<no-i-1;j++) {
                if (arr[j + 1] < arr[j]) {
                    int element=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=element;



                }
            }


        }
        for (int i:arr) {


            System.out.print(i +" ");
        }


    }
}

package com.company;

public class insertion_sort {

    //do it with while loop only it is very complicated with for loop

    public static void main(String[] args) {
        int[] arr={2,5,3,4,6,7,0};
        int count=0;



        int l =arr.length;
        for (int i =1;i<l;i++){
            int swam=arr[i];
            for(int j=i-1;j>=0;j--){
                if (arr[j]>swam){

                    int element=arr[j];
                    arr[j+1]=arr[j];
                    count+=1;


                }


              arr[i-count]=swam;


            }
            count=0;



        }
        for (int i:arr) {


            System.out.print(i +" ");
        }


    }
}

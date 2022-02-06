package com.company;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr={2,5,3,4,6,7,0};




        int l =arr.length;
        for (int i =0;i<l;i++){
            int smallest=i;
            for(int j=i+1;j<=l-1;j++){
                if (arr[j]<arr[smallest]){
                    smallest=j;
                    int element=arr[smallest];
                    arr[smallest]=arr[i];
                    arr[i]= element;









                }




            }






        }
        for (int i:arr) {


            System.out.print(i +" ");
        }
    }
}

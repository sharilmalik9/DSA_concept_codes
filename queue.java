package com.company;

public class queue {
    private int[] arr;
    private int start=0;
    private int size=0;

     public queue(){
     arr= new int[5];

    }
     public queue(int limit){
      arr= new int[limit];

     }
//     public boolean isfull(){
//         return true;
//     }
     public void add(int element){
         if(isfull()){
             throw new RuntimeException("full it is");
         }
         int idx=(start+size)%arr.length;
         arr[idx]=element;
         // start will only move to next when first element gets removed
         size++;


     }
     public int peek(){
         if(isempty()){
             throw new RuntimeException("it is empty");
         }
         return arr[start];
     }
     public int poll(){
         if(isempty()){
             throw new RuntimeException("nothing left to poll ");
         }
         int ali=arr[start];
         start++;
         start=start%arr.length;  // if it goes out of array this will make ot come back
         size--;
         return ali;

     }
     public boolean isempty(){
         return size==0;
     }
     public boolean isfull(){
         return size==arr.length;
     }
     public void display(){
         for(int i=start;i<start+size;i++){
             System.out.print(arr[i%arr.length]+" ");
         }
         System.out.println();
     }
}

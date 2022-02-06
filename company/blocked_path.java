package com.company;
// you are given a grid with 0 and 1 entries if 1 appears in your path it is blocking the way
// so surpass 1 and you have to reach a point for eg (3,4) so find all the ways to do so
// u can go in all directions

public class blocked_path {
    static void blockedp(int c ,int r ,int max_c,int max_r,String ans,int[][] arr,boolean[][] sol){
     if(c==max_c && r==max_r){
         System.out.println(ans);
         return;
     }
     if(r<0||c<0||r>max_r||c>max_c||r==arr.length||c==arr[0].length||arr[r][c]==1||sol[r][c]){
         // if it is true somewhere then that point is already used in path so go back
         // first u write the reaching negativr and max condition cause we will check other conditions
         // only when we are in right position of grid

         return;
     }
     sol[r][c]=true;
     // making this boolean array so that we dont use a same point in one same path otherwise we will end
        // up in an endless loop
     blockedp(c,r-1,max_c,max_r,ans+"U",arr,sol);
     blockedp(c,r+1,max_c,max_r,ans+"D",arr,sol);
     blockedp(c-1,r,max_c,max_r,ans+"L",arr,sol);
     blockedp(c+1,r,max_c,max_r,ans+"R",arr,sol);
     sol[r][c]=false; // explicit backtracking
        // after fidning one way we have to find another way but it might be posssible that
        // we need a same point again so we have to backtrack as well


        

    }

    public static void main(String[] args) {
        int[][] arr={{0,0,1,0},{1,0,0,0},{0,0,0,0,},{1,1,0,0}};
        boolean[][] sol=new boolean[arr.length][arr[0].length]; // in inner bracket you write the bigger array size
        // in outer bracket you write the size of inner arrays
        // considering it is a grid so rows  and columns will be of equal length only so we take length of first one


        blockedp(0,0,3,2,"",arr,sol);



    }
}

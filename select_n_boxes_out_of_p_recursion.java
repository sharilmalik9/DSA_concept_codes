package com.company;
//method- from user point of view
// permutation of n boxes out of p
//using permutation
public class select_n_boxes_out_of_p_recursion {
    static void boxes(boolean[] arr,int toselect,String ans){
        if(toselect==0){
            System.out.println(ans);
            return;                       // here we want to select only given no so we put return
                                           // as loop will not stop this condition
        }
        for(int i=0;i<arr.length;i++){
            if(!arr[i]){
                arr[i]=true;
                boxes(arr,toselect-1,ans+"b"+i);
                arr[i]=false;
            }
        }
    }
    // using combination
    static void combbox(int total,int toselect,String ans,int lastindx){
        if(toselect==0){
            System.out.println(ans);
        }
        for(int i=lastindx;i<total;i++){
            combbox(total,toselect-1,ans+"b"+i,i+1);
        }

    }

    // from box point of view
    //box will have 2 choice to get select or not get select
    static void comb_wrt_box(int total,int toselect,String ans,int current ){
        //here positive first base is written first because if we write negative basecase first
        //it will return without printing ans if last box gets selected
        //+ve basecase
        if(toselect==0){
            System.out.println(ans);
            return;
        }
        //-ve basecase
        if(current==total){
            return;
        }

        //selected
        comb_wrt_box(total,toselect-1,ans+"q"+current,current+1);
        // not selected
        comb_wrt_box(total,toselect,ans,current+1);


    }
    // for 2-D grid select any (r,c) to choose
    public static void Qcomb_wrt_box2D(int curr_r, int curr_c, int total_r, int total_c, int toSelect, String ans) {

        if (toSelect == 0) {
            System.out.println(ans);
            return;
        }
//		Moving to the next row logic!!
        if (curr_c == total_c) {
            curr_r++;
            curr_c = 0;
        }

//		-ve BC
        if (curr_r == total_r) {
            return;
        }
//	if(isSafe(board,r,c)) {
        Qcomb_wrt_box2D(curr_r, curr_c + 1, total_r, total_c, toSelect - 1, ans + "Q{" + curr_r + "," + curr_c + "}"); // Bede
//	}
        Qcomb_wrt_box2D(curr_r, curr_c + 1, total_r, total_c, toSelect, ans); // Na Bede

    }






    public static void main(String[] args) {
    //    boxes(new boolean[4],2,"");
      //  System.out.println("combination from here ");
     //   combbox(4,2,"",0);
        comb_wrt_box(4,2,"",0);

    }
}

package com.company;
import java.util.*;

public class find_celebrity_ques {
    static void celebf(int[][] mat){
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<mat.length;i++){
            st.add(i);
        }
        // this step finds a potencial celeb
        // when this loop ends we will get a single element in st which might be celeb
        // why this step?
        // to find a potencial celeb and  so that we jus have to compare one element with all other elements
        while(st.size()>1){
            int a=st.pop();
            int b=st.pop();
            if(mat[a][b]==1){
                // a knows b
                st.push(b);
            }
            else{
                st.push(a);
            }

        }
        //this to check that if potencial celeb knows someone or not
        // if yes then we are breaking the code
        // celeb here is cehcking for row
        int celeb=st.pop();
        for(int i=0;i<mat.length;i++){
            if(mat[celeb][i]==1){
                System.out.println("no celeb here ");
                return;
            }
        }
        // just to check the potecial celeb doesnt know anyone in other rows
        // celeb here is checking for  column
        for(int i=0;i<mat.length;i++){
            if(mat[i][celeb]==0 && celeb!=i){
                System.out.println("no celeb here ");
                return;
            }
        }
        // if till here the code is running and not  returned then potencial celeb is final celeb!!
        System.out.println("celeb is "+celeb);


    }
    // no matrix can have 2 celebs

    public static void main(String[] args) {
        int[][] mat={{0,1,1,1},
                     {1,0,1,0},
                     {0,0,0,0},
                     {1,1,1,0}};

        celebf(mat);
    }
}

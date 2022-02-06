package com.company;
import java.util.*;

public class contest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int size=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<size;i++){
            int element=sc.nextInt();
            arr.add(element);
        }
        Collections.sort(arr);
        int[] ans =new int[1];

        int n=0;
        for(int i=0;i<=arr.size();i++){
            n=arr.indexOf(i);
            if(n==-1){
                ans[0]=i;
                break;
            }

        }
        if(ans.length==0){
            System.out.println(arr.get(arr.size())+1);
        }
        else{
            System.out.println(ans[0]);
        }



    }
}

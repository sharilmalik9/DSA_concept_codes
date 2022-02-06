package com.company;
import java.util.*;

public class Count_ways_to_Nth_Stair {

    public static void stair(int stairs,String str,int sum,List<String> al) {

        if (sum>stairs){

            return;
        }
        if (sum==stairs){

                al.add(str);
                return;

        }
        stair(stairs,str+"1",sum+1,al);
        stair(stairs,str+"2",sum+2,al);
       // stair(stairs,str+"3",sum+3,count);

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sta=sc.nextInt();
        List<String> al=new ArrayList<>();
        List<Integer> al1=new ArrayList<>();
        int c1=0;
        int c2=0;

        stair(sta,"",0,al);
        for(String str:al){
           // System.out.println(str);
            for(int i=0;i<str.length();i++) {
              //  int j=Character.compare(str.charAt(i),'1');
                if ((str.charAt(i)) =='1') {
                  //  System.out.println("i entred");
                    c1++;
                }
            }
            // System.out.println(c1);

            if(!(al1.contains(c1))){
              //  System.out.println(c1);
                    al1.add(c1);



                }
            c1=0;








        }
        System.out.println(al1.size());




    }

}

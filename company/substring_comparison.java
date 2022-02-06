package com.company;
import java.util.Scanner;
import java.io.*;

public class substring_comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int no = sc.nextInt();
        String[] list = new String[str.length() - no + 1];

        for (int i = 0; i < str.length() - no + 1; i++) {

            String sub = str.substring(i, i + no);


            list[i] = sub;


        }
        String flag="";
        for(int m =0;m<str.length() - no+1;m++){
            for(int j=m+1;j<str.length() - no+1;j++) {
                int compare = list[m].compareTo(list[j]);
//            System.out.println(list[m]);


                if (compare > 0) {
                    flag = list[m];
                    list[m] = list[j];
                    list[j] = flag;


                }
            }

        }

        System.out.println(list[0]);
        System.out.println(list[str.length() - no]);
//       String largest = " ";
//       String smallest = " ";

//        for (int m = 0; m < str.length() - no; m++) {
//               System.out.println(list[m]);
//            int compare = list[m].compareTo(list[m + 1]);
//
//
//
//               if (compare >0 ) {
//                   int compare1=largest.compareTo(list[m]);
//                           if(compare1<0) {
//
//
//                               largest = list[m];
//
//                           }
//
//               }
//               else {
//                   System.out.println("i intered");
//                   int compare2=smallest.compareTo(list[m+1]);
//                   if(compare2>0) {
//                       System.out.println("hey");
//
//
//                       smallest = list[m+1];
//                       System.out.println(smallest);
//                   }
//                   else{
//                       System.out.println("bye ");
//                   }
//               }
//
//
//
//       }
//           System.out.println(smallest);
//           System.out.println(largest);












    }
}

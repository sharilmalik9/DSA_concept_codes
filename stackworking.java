package com.company;
import java.util.*;

public class stackworking {
    public static void main(String[] args) throws Exception{
        stack st= new stack(3); // new stack called is called by constructor if u are not mentioning 3
        // in the defining stage then it will call default constructor and 5 will be default size of array

       st.add(2);
       st.add(3);
       st.add(4);
        System.out.println(st.pop());

//       st.add(5);
//       st.add(10);
       st.display();
       st.pop();
       st.display();
       st.isfull();
       st.isempty();
       st.add(30);
       st.display();
        System.out.println(st.size());





    }
}

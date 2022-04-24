package com.company;
import java.util.*;

public class queue_working {
    public static void main(String[] args) throws Exception {
        queue q=new queue(3);
        q.add(29);
        q.add(69);
        q.add(59);
        q.display();
        q.poll();
        q.poll();
        q.display();
        q.add(45);
        q.add(46);
        q.display();




    }
}

package com.company;
import java.util.*;

//Kartik sir loves coding. Hence, he took up the position of an instructor and founded Coding Blocks,
// a startup that serves students with awesome code modules. It is a very famous place and students are
// always queuing up to have one of those modules. Each module has a cost associated with it. The modules
// are kept as a pile. The job of an instructor is very difficult. He needs to handle two types of queries:
//1) Student Query: When a student demands a module, the code module on the top of the pile is given and
// the student is charged according to the cost of the module. This reduces the height of the pile by 1.
// In case the pile is empty, the student goes away empty-handed.
//2) Instructor Query: Sir prepares a code module and adds it on top of the pile. And reports the
// cost of the module. Help him manage this process.
//Input Format
//First line contains an integer Q, the number of queries. Q lines follow.
// A Type-1 ( Student ) Query, is indicated by a single integer 1 in the line.
// A Type-2 ( Instructor ) Query, is indicated by two space separated integers 2
// and C (cost of the module prepared) .
// given inbuilt stackusingarray
// object of stackusing class created

public class Kartik_Sir_and_Coding {


    static Scanner s = new Scanner(System.in);

    public static void main(String args[]) throws Exception {
        // Your Code Here


        int q = s.nextInt(); // no of inputs it want
        // use to create object of a class in same class
        Kartik_Sir_and_Coding mainobj = new Kartik_Sir_and_Coding();

        StacksUsingArrays stack = mainobj.new StacksUsingArrays(q);


        Integer[][] ans = new Integer[q][2];
        for (int i = 0; i < q; i++) {
            int element = s.nextInt();
            if (element == 1) {
                ans[i][0] = element;
                ans[i][1] = null;
            } else {
                int value = s.nextInt();
                ans[i][0] = element;
                ans[i][1] = value;

            }


        }
        Calculate(stack, ans);
    }

    public static void Calculate(StacksUsingArrays st, Integer[][] ans) throws Exception {
        for (int i = 0; i < ans.length; i++) {
            if (ans[i][0] == 1) {
                int element = st.pop();
                System.out.println(element);
            } else {
                st.push(ans[i][1]);
            }
        }


        //Write Your Code Here
        /* Donot initialize another Scanner use the static scanner already declared*/
    }

    private  class StacksUsingArrays {
        private int[] data;
        private int tos;

        public static final int DEFAULT_CAPACITY = 10;

        public StacksUsingArrays() throws Exception {
            // TODO Auto-generated constructor stub
            this(DEFAULT_CAPACITY);
        }

        public StacksUsingArrays(int capacity) throws Exception {
            if (capacity <= 0) {
                System.out.println("Invalid Capacity");
            }
            this.data = new int[capacity];
            this.tos = -1;
        }

        public int size() {
            return this.tos + 1;
        }

        public boolean isEmpty() {
            if (this.size() == 0) {
                return true;
            } else {
                return false;
            }
        }

        public void push(int item) throws Exception {
            if (this.size() == this.data.length) {

                int[] temp = new int[2 * data.length];
                for (int i = 0; i < data.length; i++) {
                    temp[i] = data[i];
                }

                data = temp;
            }
            this.tos++;
            this.data[this.tos] = item;
        }

        public int pop() throws Exception {
            if (this.size() == 0) {
                throw new Exception("Stack is Empty");
            }
            int retVal = this.data[this.tos];
            this.data[this.tos] = 0;
            this.tos--;
            return retVal;
        }

        public int top() throws Exception {
            if (this.size() == 0) {
                throw new Exception("Stack is Empty");
            }
            int retVal = this.data[this.tos];
            return retVal;
        }

        public void display() throws Exception {
            if (this.size() == 0) {
                throw new Exception("Stack is Empty");
            }
            for (int i = this.tos; i >= 0; i--) {
                System.out.println(this.data[i]);
            }

        }
    }
}



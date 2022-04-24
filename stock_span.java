package com.company;
// liv session 33
//The stock span problem is a financial problem where we have a series of N daily price
// quotes for a stock and we need to calculate span of stock’s price for all N days.
// You are given an array of length N, where ith element of array denotes the price of a stock
// on ith. Find the span of stock's price on ith day, for every 1<=i<=N.
//A span of a stock's price on a given day, i, is the maximum number of consecutive days before
// the (i+1)th day, for which stock's price on these days is less than or equal to that on the ith day.


import java.util.*;
public class stock_span {

    public static void main(String args[]) throws Exception {
        // Your Code Here
        Scanner s = new Scanner(System.in);
        int N=s.nextInt();
        stock_span mainobj = new stock_span();
        int[] prices=new int[N];
        for(int i=0;i<N;i++){
            prices[i]=s.nextInt();
        }
        StacksUsingArrays stack = mainobj.new StacksUsingArrays(prices.length);
        int[] ans=StockSpanUsingStacks(prices, stack);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println("END");

    }

    public static int[] StockSpanUsingStacks(int[] prices, StacksUsingArrays stack) throws Exception {
        int[] ans = new int[stack.size()-1];
        int current;
        int i=0;

        int count=stack.size()-2;
        while(!stack.isEmpty()){
            ArrayList<Integer >safety= new ArrayList<>();
            current=stack.pop();
            if(current<stack.top()){
                ans[count]=1;
                count--;

            }
            else{
                safety.add(stack.pop());

              while(!stack.isEmpty()){
                  if(stack.top()>current){
                      break;
                  }
                  else{
                      safety.add(stack.pop());


                  }
              }
              ans[count]= safety.size();
              count--;

              for(int m= safety.size()-1;m>=0;m--){
                  stack.push(safety.get(m));
              }

            }

        }
        return ans;

    }

    private class StacksUsingArrays {
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
                throw new Exception("Stack is Full");
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


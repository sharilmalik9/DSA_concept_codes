package com.company;

public class stack {
    private int[] arr;
    // tos= top of stack
    private int tos=0; // idx here refers to top of the stack which means that position of  stack in
    // very beginning. so since at start no element is present there so it is at -1
    // and now we will start adding at idx+1 = 0
    //   here we are not taking  idx as 0 because then it will add 0 auto to 0 index as that will be condidered
    // at top of stack then
    public stack(){ // default constructor
        arr=new int[5];
    }
    public stack(int bound){ // customise constructor
        arr= new int[bound];
    }
    public int size(){
        return tos;
    }

    public boolean isfull(){
        return arr.length==size();
    }
    public void add(int element) {
        if(isfull()){
            // if you are already defining the exception then no need to mention it in function defining stage
            // but if u r just writing exception(not sepcific) then you have to mention in function also
            throw new RuntimeException("stack if full");
        }
        arr[tos]=element;
        tos++;
    }
    public Boolean isempty(){
        return size()==0;

    }
    public int peek() throws Exception{
        if(isempty()){
            throw new Exception("stack is empty");
        }
        return arr[tos];
    }
    public int pop() throws Exception{
        if(isempty()){
            throw new Exception("nothing to pop here ");
        }
        int ans=arr[tos-1];
        tos--;
        return ans;
    }
    public void display(){
        for(int i=0;i<tos;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }





}

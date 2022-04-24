package com.company;
import java.util.*;



//public class linked_list_basic_functions {
//    // nested  class
//    // node declaration learn as it is
//    class Node {
//        int data;
//        Node next;
//
//        // gives root value to node
//
//        public Node() {
//
//        }
//
//        public Node(int ali) {
//            data = ali;
//        }
//    }
//    Node root;
//    public void display(){
//        Node temp=root;
//        while(temp!=null){
//            System.out.println(temp.data);
//            temp=temp.next;
//
//        }
//    }
//    public int size(){
//        int count=0;
//        Node element= root;
//        while(element!=null){
//            count++;
//           element= element.next;
//        }
//        return count;
//
//    }
//    public int getfirst(){
//        if(size()==0){
//            throw new RuntimeException("no element here ");
//        }
//        Node element=root;
//        return element.data;
//        // return root.data
//    }
//    public int getlast(){
//        if(size()==0){
//            throw new RuntimeException("no element here");
//        }
//        Node temp=root;
//        while(temp.next!=null){
//           temp= temp.next;
//        }
//        return (temp.data);
//    }
//    public int getat(int idx){
//        Node temp=root;
//        for(int i=0;i<idx;i++){
//            temp=temp.next;
//        }
//        return temp.data;
//
//    }
//    public void addfirst(int ali ){
//        // use the constructor
//        // this creates a new node
//        // new adress for ali
//        // we have to place that adress at right place as per our question
//        Node nn =new Node(ali) ;
//        // this puts root address at next node (next adress block for ali )
//        nn.next=root; // old root value to be shifted to next
//        root=nn; //  new root is nn node address value
//    }
//    public void addlast(int ali){
//        Node nn= new Node( ali);
//        if(size()==0){
//            root=nn;
//        }
//        else{
//            Node temp=root;
//            while(temp.next!=null){
//                temp=temp.next;
//            }
//            temp.next=nn;
//
//        }
//
//    }
//    private Node getnodeat(int idx){
//        Node temp=root;
//        for(int i=1;i<=idx;i++){
//           temp= temp.next;
//        }
//        return temp;
//    }
//    public void addat(int idx,int ali){
//        if(idx==0){
//            addfirst(ali);
//        }
//        if(idx==size()-1){
//            addlast(ali);
//        }
//        else {
//            Node nn = new Node(ali);
//            Node alement = getnodeat(idx);
//            Node prev = getnodeat(idx - 1);
//            Node After = prev.next;
//            prev.next = nn;
//            nn.next = After;
//        }
//
//    }
//    public void removefirst(){
//        Node element=root;
//        if(size()==0){
//            throw new RuntimeException("nothing here");
//        }
//        element.next=root;
//
//    }
//    public void removelast(){
//        if(size()==0){
//            throw new RuntimeException("byee");
//        }
//        if(size()==1){
//            removefirst();
//        }
//        else {
//            Node element = root;
//            Node ali = getnodeat(size() - 1);
//            ali = null;
//        }
//
//    }
//    public void removeat(int idx){
//        Node element=getnodeat(idx);
//        element=element.next;
//    }
//    public int removeAt(int idx) {
//        if (idx == 0) {
//            removefirst();
//        } else if (idx == size() - 1) {
//            removelast();
//        } else {
//            Node prev = getnodeat(idx - 1);
//            Node curr = prev.next;
//            Node after = curr.next;
//
//            prev.next = after;
//
//            return curr.data;
//        }
//
//        // here we change the direction of pointers
////        static public void Rev(){
////            Node prev = root;
////            Node curr = root.next;
////
////            while (curr != null) {
////                Node After = curr.next;
////
////                curr.next = prev;
////
////                prev = curr;
////                curr = After;
////            }
////            root.next = null;
////            root = prev;
////        }
////        // find mid without using size function
////        public void mid() {
////            Node fast = root;
////            Node slow = root;
////            while (fast != null && fast.next != null) {
////                fast = fast.next.next;
////                slow = slow.next;
////            }
////            System.out.println(slow.data);
////        }
////        // rev using stack
////        // didnt understand though
////        public void RevK(int K){
////            Node S_n = null;
////            Node E_n = null;
////
////            Stack<Node> S = new Stack<Node>();
////            Node temp = root;
////            while (temp != null) {
////
////                S.push(temp);
////                Node After = temp.next;
////                if (S.size() == K) {
//////				ulti!!!
////                    while (!S.isEmpty()) {
////                        Node nn = S.pop();
//////					System.out.print(nn.data + " ");
//////					insert this node nn in the LinkedList _n
////                        if (S_n == null) {
////                            S_n = nn;
////                            E_n = nn;
////                        } else {
////                            E_n.next = nn;
////                            E_n = nn;
////                        }
////                    }
//////				System.out.println();
////                }
////                temp = After;
////            }
////            while (!S.isEmpty()) {
////                Node nn = S.pop();
//////			System.out.print(nn.data + " ");
//////			insert this node nn in the LinkedList _n
////                if (S_n == null) {
////                    S_n = nn;
////                    E_n = nn;
////                } else {
////                    E_n.next = nn;
////                    E_n = nn;
////                }
////            }
////            E_n.next = null;
////            root = S_n;
////        }
////    }
////
////
////
////
////
////
////
//}

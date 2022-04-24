package com.company;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Binary_tree {
    // node is a inbuilt class which refers to nodes / address

    class Node {
        int data;
        Node left;
        Node right;
        // if user calls node class with and element already
        // constructor class
        public Node(int i ){
            data=i;
        }
    }
    // we create root node outside because root is one only and universal so make it global
    // i.e outside in main class
    // always create only one scanner class
    Node root;
    Scanner sc= new Scanner(System.in);
    // constructor method of class binary tree
    // to create a tree in class binary tree we will use this consructor  method
    // we do not mention any return type in constructor class because it is same as that of class
    public  Binary_tree(){
        root=create(null,false);
    }
    // here we are using return type as node as we are using this function to create tree and also
    // give back root node as mentioned in constructor class of binary tree
    public Node create(Node parent,Boolean isleft){
        if(parent==null){
            System.out.println("root data de ");

        }
        else if(isleft){
            System.out.println("left data de ");

        }
        else{
            System.out.println("right data de ");
        }
        Node nn = new Node(sc.nextInt());
        System.out.println(nn.data+"left data hain?");

        if(sc.nextBoolean()){
            create(nn,true);

        }
        System.out.println(nn.data+"right data hai ?");

        if(sc.nextBoolean()){
            create(nn,false);
        }
        return nn;
    }
    // return type void here
    // because root node will be given to us
    // this is create class uper wali ka regenerated
    // same name 2 methods can be there if parament is different
    // smaller problem - create left side of parent and create rigth side of parent


    public void Create(Node parent ){
        System.out.println(parent.data+"left child hai ?");
        if(sc.nextBoolean()){
            System.out.println("left data de ");

            parent.left= new Node(sc.nextInt());
            Create(parent.left);

        }
        System.out.println(parent.data+" ke right meij data hai ?");
         if (sc.nextBoolean()){
             System.out.println("right ka data de");
             parent.right=new Node(sc.nextInt());
             Create(parent.right);

        }


    }
    // display function
    // we create and private and one public class because when user will call the fucntion it will
    // just call it and it cannot pass the root node because he will not be able to see root node
    // and to call disp we need root so we pass value like this by creating another public class
    public void Disp(){
        Disp(root);
    }
    private void Disp(Node nn){
        if(nn==null){
            return;
        }
        System.out.println(nn.data);
        Disp(nn.left);
        Disp(nn.right);


    }
    //size function
    public int size(){
      return size(root);

    }
    private int size(Node nn ){
        if(nn==null){
            return 0;
        }
        int left=size(nn.left);
        int right= size(nn.right);
        return left +right+1;
    }
    // find function
    public Boolean find(int ali){
        return find(root,ali);
    }
    private Boolean find(Node nn, int ali){
        if(nn==null){
            return false;


        }
        if(nn.data==ali){
            return true;
        }

            Boolean left = find(nn.left, ali);
            Boolean right = find(nn.right, ali);
            return left||right;



    }

    //height function
    public int ht(){
        return ht(root);
    }
    private int ht(Node nn){
        if(nn==null){
            return -1;

        }
        int left=ht(nn.left);
        int right=ht(nn.right);
        return Math.max(left,right)+1;
    }
    // diameter function
    public int dia(){
        return dia(root);
    }
    private int dia(Node nn ){
        if(nn==null){
            return 0 ;

        }
        int left=dia(nn.left);
        int right=dia(nn.right);
        // self dia
        int self=ht(nn.left)+ht(nn.right)+2;
        return Math.max(self,Math.max(left,right));


    }
    // give height and diameter together
    // same logic just way check
    private DiaHtPair Dia2(Node nn) {
        if (nn == null) {
            DiaHtPair bs = new DiaHtPair();
            return bs;
        }
        DiaHtPair L = Dia2(nn.left);
        DiaHtPair R = Dia2(nn.right);

//		Self Dia!!
        int SD = L.Ht + R.Ht + 2;

//		Pair muje~~~
        DiaHtPair ans = new DiaHtPair();
        ans.Dia = Math.max(SD, Math.max(R.Dia, L.Dia));

        ans.Ht = Math.max(L.Ht, R.Ht) + 1;

        return ans;
    }

    class DiaHtPair {
        int Dia = 0;
        int Ht = -1;
    }
    public boolean isbst(){
        return isbst(root);
    }
    // balanced or not
    // simple formula !! use that is given in a question
    private Boolean isbst(Node nn ){
        if(nn==null){
            return true;
        }
        Boolean l= isbst(nn.left);
        Boolean r= isbst(nn.right);
        if(l&&r){
            int lh=ht(nn.left);
            int rh=ht(nn.right);
            return Math.abs(lh-rh)<=1;
        }
        // if l and r and not balanced no point of checking at root simply return false
        return false;
    }
    private BoolHtPair isBST2(Node nn) {
        if (nn == null) {
            return new BoolHtPair();
        }
        BoolHtPair L = isBST2(nn.left);
        BoolHtPair R = isBST2(nn.right);
//		check nn ?? is the node balanced ?!
        BoolHtPair ans = new BoolHtPair();

        if (L.isBST && R.isBST) {
            int result = L.Ht - R.Ht;
            ans.isBST = Math.abs(result) <= 1;
        } else {
            ans.isBST = false;
        }
        ans.Ht = Math.max(L.Ht, R.Ht) + 1;
        System.out.println(nn.data + " " + ans);
        return ans;
    }

    class BoolHtPair {
        boolean isBST = true;
        int Ht = -1;

        public String toString() {
            return "{" + isBST + " , Ht =" + Ht + " }";
        }
    }
    // given u a pre order transversal create a tree using that
    int idx=0;
    Binary_tree(int[] pre){
        idx=0;
        createpre(pre);

    }
    private Node createpre(int[] pre ){
        if(pre[idx]==-1){
            // when u encounter an -1  we should move to next index also
            idx++;

            return null;
        }
        Node nn= new Node(pre[idx]);
        idx++;
        nn.left=createpre(pre);
        nn.right=createpre(pre);
        return nn;
    }
    // given  u  a pre order and in order tranvsersal aarray create a tree using that
    private Node createprein(int[] pre,int ps,int pe,int[] in,int is,int ie){
        if(ie<ie||pe<ps){
            // if start and end cross ie. index out of range / bound
            return null;
        }
        int idx = ps;
        int nn_data=pre[ps];
        int left_size=0;
        while(nn_data!=in[idx]){
            idx++;
            left_size++;

        }
        Node nn=new Node(nn_data);
        nn.left=createprein(pre,ps+1,ps+left_size,in,is,idx-1);
        nn.right=createprein(pre,ps+1+left_size,pe,in,idx+1,ie);
        return nn ;



    }
    Binary_tree(int[] pre ,int[] in){
        createprein(pre,0,pre.length-1,in,0,in.length-1);
    }
    // given you pre and post array
    private Node createprepost(int[] pre,int ps,int pe, int[] post,int pos,int poe){
        if(pe<ps||poe<pos){
            idx++;
            return null;
        }
        int idx=0;
        int left_size=0;
        int nn_data=pre[ps];
        while(pre[1]!=post[idx]){
            idx++;
            left_size++;
        }
        Node nn = new Node(nn_data);
        idx++;
        nn.left=createprepost(pre,ps+1,idx+1,post,pos,left_size-1);
        nn.right=createprepost(pre,left_size+1,pe,post,idx+1,poe-1);
        return nn ;


    }
    //using level create tree
    private void lvlc(int arr[]){
        Node nn= new Node(arr[0]);
        Queue<Node> q= new LinkedList<>();
        q.add(nn);
        int index=1;
        while(!q.isEmpty()){
            Node val= q.poll();
            if(arr[idx]!=-1){
              Node L= new Node(arr[idx]);
               q.add(L);
               nn.left=L;
            }
            idx++;
            if(arr[idx]!=-1) {
                Node R = new Node(arr[idx]);
                q.add(R);
                nn.right = R;
                idx++;
            }
            idx++;
        }

    }
    // printing the level transversal
    public void LvL2() {
        Queue<Node> CurrLvl = new LinkedList<>();
        Queue<Node> NextLvl = new LinkedList<>();
        CurrLvl.add(root);
        while (!CurrLvl.isEmpty()) {
            Node nn = CurrLvl.poll();

            System.out.print(nn.data + " ");
            if (nn.left != null) {
                NextLvl.add(nn.left);
            }
            if (nn.right != null) {
                NextLvl.add(nn.right);
            }
            if (CurrLvl.isEmpty()) {
//		Curr lvl is done!! go to the next lvl~~
                System.out.println(" Working on " + NextLvl);
                CurrLvl = NextLvl;
                NextLvl = new LinkedList<>();
                System.out.println();
            }
        }

    }
    // printing level and tree in a pair  both in level transversal
    class NodelvlPair {
        Node Node;
        int lvl;

        public NodelvlPair(Node n, int l) {
            // TODO Auto-generated constructor stub
            Node = n;
            lvl = l;
        }

    }
    private void level2(){
        Queue<NodelvlPair> Q = new LinkedList<NodelvlPair>();
        Q.add(new NodelvlPair(root, 0));
        while(!Q.isEmpty()){
            NodelvlPair nn= Q.poll();
            if(nn.Node==null){
                continue;

            }
            System.out.println(nn.Node.data + " -- " + nn.lvl);
            Q.add(new NodelvlPair(nn.Node.left,nn.lvl+1));
            Q.add(new NodelvlPair(nn.Node.right,nn.lvl+1));

        }
    }
    // two tress are equivalent or not
    public boolean Equiv(Node root1, Node root2) {
        if (root1 == root2 && root1 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        boolean L = Equiv(root1.left, root2.left);
        boolean R = Equiv(root1.right, root2.right);

        return L && R && root1.data == root2.data;

    }
    private int Min(Node nn) {
        if (nn == null) {
            return Integer.MAX_VALUE;
        }
        // TODO Auto-generated method stub
        int L = Min(nn.left);
        int R = Min(nn.left);

        return Math.min(nn.data, Math.min(L, R));
    }

    private int Max(Node nn) {
        // TODO Auto-generated method stub
        if (nn == null) {
            return Integer.MIN_VALUE;
        }
        int L = Max(nn.left);
        int R = Max(nn.left);

        return Math.max(nn.data, Math.max(L, R));
    }
    public boolean isBST1() {
        return isBST1(root);
    }

    private boolean isBST1(Node nn) {
        if (nn == null) {
            return true;
        }
//		check curr Node condition!!
//		max of left and Right ka min!!
        int Mx = Max(nn.left);
        int Mn = Min(nn.right);
        if (Mx <= nn.data && nn.data < Mn) {

            boolean L = isBST1(nn.left);
            boolean R = isBST1(nn.right);

            return L && R;
        }
        return false;

    }
    private isBSTpair isBST3(Node nn) {
        if (nn == null) {
            return new isBSTpair();
        }
//		check curr Node condition!!
//		max of left and Right ka min!!
        isBSTpair L = isBST3(nn.left);
        isBSTpair R = isBST3(nn.right);
        isBSTpair ans = new isBSTpair();
        if (L.Max <= nn.data && nn.data < R.Min) {
            ans.isBST = L.isBST && R.isBST;
        } else {
            ans.isBST = false;
        }
//		max!!
        ans.Max = Math.max(nn.data, Math.max(L.Max, R.Max));
        ans.Min = Math.min(nn.data, Math.min(L.Min, R.Min));

        return ans;

    }

    class isBSTpair {
        boolean isBST = true;
        int Max = Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;

    }













}

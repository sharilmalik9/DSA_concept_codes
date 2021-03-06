package com.company;
import java.util.*;

public class BST_Btree {
    class Node {
        int data;
        Node left;
        Node right;

        public Node(int i) {
            data = i;
        }
    }

    Node root;

    // bst is same as a tree only just it satifies a property so other mthods of tree are common here
    public void Disp() {
        Disp(root);
    }

    private void Disp(Node nn) {
        if (nn == null) {
            return;
        }
// Self work!!
        String str = "";
        if (nn.left != null) {
            str = str + nn.left.data;
        }
        str = str + " ==> " + nn.data + " <== ";
        if (nn.right != null) {
            str = str + nn.right.data;
        }
        System.out.println(str);
//
        Disp(nn.left);

        Disp(nn.right);

    }

    public int Size() {
        return Size(root);
    }

    private int Size(Node nn) {
        if (nn == null) {
            return 0;
        }
        int sp1 = Size(nn.left);
        int sp2 = Size(nn.right);

        return sp1 + sp2 + 1;
    }

    public boolean Find(int alo) {
        return Find(root, alo);
    }

    private boolean Find(Node nn, int aloo) {
        if (nn == null) {
            return false;
        }
        if (nn.data == aloo) {
            return true;
        }
        if (nn.data > aloo) {
            return Find(nn.left, aloo);

        } else {
            return Find(nn.right, aloo);
        }
    }

    public int Ht() {
        return Ht(root);
    }

    private int Ht(Node nn) {
        if (null == nn) {
            return -1;
        }
        int L = Ht(nn.left);
        int R = Ht(nn.right);

        return Math.max(L, R) + 1;
    }

    public int Max() {
        return Max(root);
    }

    private int Max(Node nn) {
        if (nn.right == null) {
            return nn.data;
        }
        return Max(nn.right);
    }

    public void createLvl(int[] lvl) {

        root = new Node(lvl[0]);
        int idx = 1;
        Queue<Node> Q = new LinkedList<>();
        Q.add(root);
        while (!Q.isEmpty()) {
            Node nn = Q.poll();
            if (lvl[idx] != -1) {
                Node L = new Node(lvl[idx]);
                Q.add(L);
                nn.left = L;
            }
            idx++;
            if (lvl[idx] != -1) {
                Node R = new Node(lvl[idx]);
                Q.add(R);
                nn.right = R;
            }
            idx++;
        }
    }

    private Node add(Node nn, int i) {
        if (nn == null) {
            return new Node(i);
        }
        if (nn.data >= i) {
            nn.left = add(nn.left, i);
        } else {
            nn.right = add(nn.right, i);
        }
        return nn;
    }

    public void add(int i) {
        root=add(root,i);

    }
    private Node remove(Node nn, int aloo) {
        if (nn.data > aloo) {
            nn.left = remove(nn.left, aloo);
        } else if (nn.data < aloo) {
            nn.right = remove(nn.right, aloo);
        } else {
//			case 1: aloo is leaf Node!!
            if (nn.left == null && nn.right == null) {
                return null;
            }
//			case 2: aloo has only a single child!!
            if (nn.left == null && nn.right != null) {
                return nn.right;
            }
            if (nn.left != null && nn.right == null) {
                return nn.left;
            }
//			case 3: has both children!!
            if (nn.left != null && nn.right != null) {
//				update nn.data to left sub tree ka max ya fir
//				right sub tree ka min!!
                int max = Max(nn.left);
                nn.data = max;
                nn.left = remove(nn.left, aloo);
            }
        }
        return nn;
    }




}
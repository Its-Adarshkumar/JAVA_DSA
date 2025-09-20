//package BST;

import java.util.ArrayList;

public class sortedArr {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }

    static class Info{
        boolean isBst;
        int size;
        int min;
        int max;

        public Info(boolean isBst, int size ,int min, int max){
            this.isBst=isBst;
            this.size=size;
            this.min=min;
            this.max=max;
        }
    }

    public static int maxBST=0;

    public static Info largestBst(Node root){
        if(root==null){
            return new Info(true, 0, Integer.MAX_VALUE,Integer.MIN_VALUE);
        }

        Info leftInfo=largestBst(root.left);
        Info rightInfo=largestBst(root.right);
        int size=leftInfo.size+rightInfo.size+1;
        int min=Math.min(root.data, Math.min(leftInfo.min,rightInfo.min));
        int max=Math.max(root.data ,Math.max(leftInfo.max ,rightInfo.max));

        if(root.data<=leftInfo.max || root.data>=rightInfo.min){
            return new Info(false, size, min, max);
        }

        if(leftInfo.isBst && rightInfo.isBst){
            maxBST=Math.max(maxBST,size);
            return new Info(true, size, min, max);
        }
        return new Info(false, size, min, max);
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }

        System.out.print(root.data +" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static Node creatBST(int arr[],int st ,int end){
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        Node root=new Node(arr[mid]);
        root.left=creatBST(arr, st, mid-1);
        root.right=creatBST(arr, mid+1, end);
        return root;
    }

    public static void getInorder(Node root,ArrayList<Integer>inorder){
        if(root==null){
            return ;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    public static Node createbst(ArrayList<Integer>inorder, int st ,int end){
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        Node root=new Node(inorder.get(mid));
        root.left=createbst(inorder,st,mid-1);
        root.right=createbst(inorder, mid+1, end);
        return root;
    }

    public static Node balanceBst(Node root){
        //inorder sequence
        ArrayList<Integer>inorder=new ArrayList<>();
        getInorder(root, inorder);

        //sorted inorder -> balanced BST
        root=createbst(inorder,0,inorder.size()-1);
        return root;
    }
    public static void main(String[] args) {
    //     int arr[]={3,5,6,8,10,11,12};
    //     Node root=creatBST(arr, 0, arr.length-1);
    //     preorder(root);

    // Node root=new Node(8);
    // root.left =new Node(6);
    // root.left.left=new Node(5);
    // root.left.left.left=new Node(3);

    // root.right=new Node(10);
    // root.right.right=new Node(11);
    // root.right.right.right=new Node(12);

    // root=balanceBst(root);
    // preorder(root);

    Node root=new Node(50);
    root.left =new Node(30);
    root.left.left=new Node(5);
    root.left.left.left=new Node(20);

    root.right=new Node(60);
    root.right.left=new Node(45);
    root.right.right=new Node(70);
    root.right.right.left=new Node(65);
    root.right.right.right=new Node(80);

    Info info=largestBst(root);
    System.out.println("largest Bst size=" +maxBST);
    }
}

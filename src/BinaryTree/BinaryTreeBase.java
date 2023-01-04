package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeBase {
    public static void main(String[] args) {
//        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
//
//        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
//        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);
//        root.left = rootLeft;
//        root.right = rootRight;

//        BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<>(1);
//        BinaryTreeNode<Integer> threleft = new BinaryTreeNode<>(1);
//        rootLeft.right = twoRight;
//        rootRight.left = threleft;

//        printTree(root);

//        BinaryTreeNode<Integer> root = takeTreeInput();
        BinaryTreeNode<Integer> root = takeTreeInputBetter(true,0,true);

//        printTreeDetails(root);
//      int n =  numOfNodes(root);
//        System.out.println("Number of nodes are:"+n);

//        preOrderTraversal(root);
//        System.out.println();
//        inOrderTraversal(root);
//        System.out.println();
//        postOrderTraversal(root);

//        int largest = largestNode(root);
//        System.out.println("largest node: "+largest);

//        int nodeGreater = nodeHreaterthen(root, 1);
//        System.out.println("greater numbere "+nodeGreater);

//        int height = heightOftree(root);
//        System.out.println("Height of the tree "+height);
//
//      int leafNode =  numleaves(root);
//        System.out.println(leafNode);

//        printAtDepthK(root ,2);

//        replaceNodeWithDepth(root,0);
//        printTree(root);

//      boolean nodePresent = isNodePresent(root,2);
//        System.out.println(nodePresent);

//        nodeWithOutSibling(root);
//     BinaryTreeNode<Integer> node =  removeLeafNode(root);
//printTree(root);
//        mirrorOfTree(root);
//        printTree(root);
//        boolean isbalance = isBalance(root);
//        System.out.println(isbalance);

//        System.out.println("is balance "+isBalanceBetter(root).isBalance);

//        BinaryTreeNode<Integer> root = takeTreeInputLevelWise();


//    printTreeDetails(root);
//        printLevelWise(root);
//printLevelWiseLine(root);
        int data = 5;
//boolean result = searchBST(root,data);
//        System.out.println(result);
//        printK1toK2(root,1,3);
        int[] arr = {1,2,3,4,5,67};
        int start = 0;
        int end = 4;

      BinaryTreeNode<Integer> root1 =   sortedArrayToBST(arr,start,end);
      preOrder(root1);

    }

    private static void preOrder(BinaryTreeNode<Integer> root1) {
    if (root1 == null){
        return;
    }
        System.out.println(root1.data+" ");
    preOrder(root1.left);
    preOrder(root1.right);

    }

    private static BinaryTreeNode<Integer> sortedArrayToBST(int[] arr, int start, int end) {
   if(start> end){
       return null;
   }
   int mid = (start+end)/2;
   BinaryTreeNode<Integer> node = new BinaryTreeNode<>(arr[mid]);
   node.left = sortedArrayToBST(arr,start,mid-1);
   node.right = sortedArrayToBST(arr,start-1,end);
   return node;
    }

    private static void printK1toK2(BinaryTreeNode<Integer> root, int k1, int k2) {
        if (root == null){
            return;
        }
        if (root.data < k1){
            printK1toK2(root.right,k1,k2);
        }else if (root.data >k2){
            printK1toK2(root.left,k1,k2);
        }else{
            System.out.print(root.data+" ");
            printK1toK2(root.left,k1,k2);
            printK1toK2(root.right,k1,k2);
        }
    }

    private static boolean searchBST(BinaryTreeNode<Integer> root, int data) {
    if (root == null){
        return false;
    }
    if (root.data == data){
        return true;
    }
    if (root.data >data){
        return searchBST(root.left ,data);
    }
    return searchBST(root.right,data);
    }

    private static void printLevelWiseLine(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()){
            BinaryTreeNode<Integer> front = queue.poll();
            if (front != null){
                System.out.println(front.data);
            }
            if (front != null && front.left != null){
                queue.add(front.left);
            }
            if (front != null && front.right != null){
                queue.add(front.right);
            }
            if (front == null){
                queue.poll();
                System.out.println();

            }


        }
    }

    private static void printLevelWise(BinaryTreeNode<Integer> root) {
        if(root==null){
            return;
        }
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            BinaryTreeNode<Integer> front =  queue.poll();
            System.out.print(front.data+":");
            if (front.left != null){
                queue.add(front.left);
                System.out.print("L:"+front.left.data+",");
            }else{
                System.out.print("L:-1,");
            }
            if (front.right != null){
                queue.add(front.right);
                System.out.print("R:"+front.right.data);
            }else{
                System.out.print("R:-1");
            }
            System.out.println();
        }
    }

    private static BinaryTreeNode<Integer> takeTreeInputLevelWise() {
   Scanner s = new Scanner(System.in);
        System.out.println("Enter root data");
   int rootdata = s.nextInt();
   if (rootdata ==-1){
       return null;
   }
   BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootdata);
        Queue <BinaryTreeNode<Integer>> pendindNode  = new LinkedList<BinaryTreeNode<Integer>>();
        pendindNode.add(root);
        while (!pendindNode.isEmpty()){
            BinaryTreeNode<Integer> front = pendindNode.poll();
            System.out.println("Enter left child of "+front.data);
            int left = s.nextInt();
            if (left != -1){
                BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<>(left);
                front.left = leftChild;
                pendindNode.add(leftChild);
            }

            System.out.println("Enter right child of "+front.data);
            int right = s.nextInt();
            if (right != -1){
                BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<>(right);
                front.right = rightChild;
                pendindNode.add(rightChild);
            }
        }
        return root;
    }

    public static isBalanceTreeReturn isBalanceBetter(BinaryTreeNode<Integer> root){
        if (root == null){
            int height = 0;
            boolean isbal = true;
            isBalanceTreeReturn ans = new isBalanceTreeReturn();
            ans.height =  height;
            ans.isBalance = isbal;
            return ans;
        }
        isBalanceTreeReturn leftOutput =  isBalanceBetter(root.left);
        isBalanceTreeReturn rightOutput = isBalanceBetter(root.right);

        boolean isBal = true;
        int height = 1+Math.max(leftOutput.height,rightOutput.height);

        if (Math.abs(leftOutput.height-rightOutput.height) > 1){
            isBal = false;;

        }
        if (!leftOutput.isBalance || !rightOutput.isBalance){
            isBal = false;
        }
        isBalanceTreeReturn ans = new isBalanceTreeReturn();
        ans.height  = height;
        ans.isBalance = isBal;
        return ans;
    }
    public static int height(BinaryTreeNode<Integer> root){
        if (root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight  = height(root.right);
        return 1+Math.max(leftHeight,rightHeight);
    }
    private static boolean isBalance(BinaryTreeNode<Integer> root) {
     if (root == null){
         return true;
     }
     int leftheight = height(root.left);
     int rightHeaight = height(root.right);
     if (Math.abs(leftheight-rightHeaight)>1){
         return false;
     }
     boolean isLeftBalance = isBalance(root.left);
     boolean isRightBalance = isBalance(root.right);
     return  isLeftBalance && isRightBalance;
    }

    private static void mirrorOfTree(BinaryTreeNode<Integer> root) {
        if (root == null){
            return;
        }
//        if (root.left == null && root.right == null){
//            return;
//        }
        mirrorOfTree(root.left);
        mirrorOfTree(root.right);
        BinaryTreeNode<Integer> temp  = root.right;
        root.right =  root.left;
        root.left = temp;
    }

    private static BinaryTreeNode<Integer> removeLeafNode(BinaryTreeNode<Integer> root) {
   if (root == null){
       return null;
   }
   if (root.left == null && root.right == null){
       return null;
   }
  root.left = removeLeafNode(root.left);
  root.right = removeLeafNode(root.right);
   return root;
    }

    private static void nodeWithOutSibling(BinaryTreeNode<Integer> root) {
        if (root == null){
            return;
        }
        if (root.left == null && root.right == null){
            System.out.print(root.data+" ");
        }
        nodeWithOutSibling(root.left);
        nodeWithOutSibling(root.right);
    }

    static boolean flag = false;
    private static boolean isNodePresent(BinaryTreeNode<Integer> root, int k) {
        if (root == null){
            return true;
        }
        if (root.data == k){
          flag = true;
        }
        isNodePresent(root.left,k);
        isNodePresent(root.right,k);
        return flag;
    }


    private static void replaceNodeWithDepth(BinaryTreeNode<Integer> root,int  k) {
   if (root == null){
       return;
   }
   replaceNodeWithDepth(root.left,k+1);
   root.data  = k;
   replaceNodeWithDepth(root.right, k+1);
    }

    //    Time complexcity of function is O(n)
    private static void printAtDepthK(BinaryTreeNode<Integer> root ,int k) {
    if (root == null){
        return;
    }

    if (k == 0){
        System.out.print(root.data+" ");
        return;
    }
    printAtDepthK(root.left,k-1);
    printAtDepthK(root.right,k-1);
    }

    private static int numleaves(BinaryTreeNode<Integer> root) {
    if (root == null){
        return 0;
    }
    if (root.left == null && root.right == null){
        return 1;
    }
    return numleaves(root.left)+numleaves(root.right);
    }

    private static int heightOftree(BinaryTreeNode<Integer> root) {
        if (root == null){
            return 0;
        }
        int leftHeight = heightOftree(root.left);
        int rrightHeight = heightOftree(root.right);

        return 1+Math.max(leftHeight,rrightHeight);
    }

    static int count = 0;
    private static int nodeHreaterthen(BinaryTreeNode<Integer> root, int i) {
        if (root == null){
            return 1;
        }
        if (root.data>i){
            count++;
        }
        nodeHreaterthen(root.left,i);
        nodeHreaterthen(root.right,i);
        return count;
    }

    private static int largestNode(BinaryTreeNode<Integer> root) {
   if (root == null){
       return -1;
   }
   int largestLeft = largestNode(root.left);
   int largestright = largestNode(root.right);
  int largest = Math.max(root.data,Math.max(largestLeft,largestright));
   return largest;
    }

    private static void postOrderTraversal(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data+" ");

    }

    private static void inOrderTraversal(BinaryTreeNode<Integer> root) {
        if (root == null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);

    }

    private static void preOrderTraversal(BinaryTreeNode<Integer> root) {
        if (root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

    }

//    Time complexcity of function is O(n)
    private static int numOfNodes(BinaryTreeNode<Integer> root) {
    if (root ==null){
        return 0;
    }
    int leftNodeCount = numOfNodes(root.left);
    int rightNodeCount = numOfNodes(root.right);
    return 1+leftNodeCount+rightNodeCount;
    }

    private static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentdata, boolean isLeft) {

        if (isRoot){
            System.out.println("Enter root data");

        }else{
            if (isLeft){
                System.out.println("Enter left child of "+parentdata);
            }else{
                System.out.println("Enter right child of "+parentdata);
            }

        }
        Scanner s  = new Scanner(System.in);
        int rootdata = s.nextInt();
        if (rootdata == -1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootdata);

        BinaryTreeNode<Integer> leftChild =takeTreeInputBetter(false,rootdata,true);
        BinaryTreeNode<Integer> rightChinld = takeTreeInputBetter(false,rootdata,false);
        root.left = leftChild;
        root.right = rightChinld;
        return root;
    }
    private static BinaryTreeNode<Integer> takeTreeInput() {
        System.out.println("Enter root data");
        Scanner s  = new Scanner(System.in);
        int rootdata = s.nextInt();
        if (rootdata == -1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootdata);

        BinaryTreeNode<Integer> leftChild =takeTreeInput();
        BinaryTreeNode<Integer> rightChinld = takeTreeInput();
        root.left = leftChild;
        root.right = rightChinld;
return root;
    }

    private static void printTreeDetails(BinaryTreeNode<Integer> root) {
        if (root == null){
            return;
        }
        System.out.print(root.data+" :");
        if (root.left != null){
            System.out.print("L "+root.left.data+", ");
          if (root.right != null){
              System.out.print("R "+root.right.data);
          }
        }
        System.out.println();
        printTreeDetails(root.left);
        printTreeDetails(root.right);
    }

    private static void printTree(BinaryTreeNode<Integer> root) {
//   base case
        if (root == null){
            return;
        }
        System.out.print(root.data+" ");
        printTree(root.left);
        printTree(root.right);

//        if (root.left != null){
//            printTree(root.left);
//        }
//      if (root.right != null){
//          printTree(root.right);
//      }

    }
}

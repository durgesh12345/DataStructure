//package BinaryTree;
//
//public class ConstractTreeUsingInorder {
//    public static void main(String[] args) {
//        int [] pre  = new int[5];
//        int [] in  = new int[5];
//            buildTreePreIn(pre,in);
//    }
//
//    private static BinaryTreeNode<Integer> buildTreePreIn(int[] pre, int[] in) {
//   BinaryTreeNode<Integer> root = buildTreePreInHelper(pre,in,0,pre.length,0,in.length);
//
//   return root;
//    }
//
//    private static BinaryTreeNode<Integer> buildTreePreInHelper(int[] pre, int[] in, int isPre, int eiPre, int siIn, int enIn) {
//   if (isPre > eiPre){
//       return null;
//   }
//   int rootData = pre[isPre];
//   BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
//   int siPreLeft;
//   int siInLeft;
//   int eiPreLeft;
//   int eiInLeft;
//        int siPreRight;
//        int siInRight;
//        int eiPreRight;
//        int eiInRight;
//
//        BinaryTreeNode<Integer> left = buildTreePreInHelper(pre,in,siPreLeft,eiPreLeft,siInLeft,eiInLeft);
//        BinaryTreeNode<Integer> right = buildTreePreInHelper(pre,in,siPreRight,eiPreRight,siInRight,eiInRight);
//        root.left = left;
//        root.left  = right;
//        return root;
//
//    }
//
//}

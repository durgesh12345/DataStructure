package GenricTree;

import static GenricTree.CountNumberOfNode.numberOfNode;
import static GenricTree.SumOfAllNode.CountNode;
import static GenricTree.printTree.printTree1;

public class TreeTest {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(4);
        TreeNode<Integer> node1 = new TreeNode<>(1);
        TreeNode<Integer> node2 = new TreeNode<>(2);
        TreeNode<Integer> node3 = new TreeNode<>(3);
        TreeNode<Integer> node4 = new TreeNode<>(5);
        TreeNode<Integer> node5 = new TreeNode<>(6);

        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);

        node2.children.add(node4);
        node2.children.add(node5);

        //  printTree1(root);
        int SumOfAllNode = CountNode(root);
     //   int countOfNode = numberOfNode(root);
        System.out.println(SumOfAllNode);



    }





}

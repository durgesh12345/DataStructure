package GenricTree;

public class printTree {
    public static void printTree1(TreeNode<Integer> root) {
        if (root == null){
            return;
        }
        System.out.print(root.data+" : ");
        for (int i = 0; i < root.children.size(); i++) {
            System.out.print(root.children.get(i).data+" ");
        }
        System.out.println();
        for (int i = 0; i < root.children.size(); i++) {
            TreeNode<Integer> child = root.children.get(i);

            printTree1(child);
        }
    }
}

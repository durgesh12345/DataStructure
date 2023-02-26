package GenricTree;

public class CountNumberOfNode {
    public static int numberOfNode(TreeNode<Integer> root) {
        int count = 1;
        for (int i = 0; i < root.children.size(); i++) {
            int childCount = numberOfNode(root.children.get(i));
            count += childCount;
        }
        return  count;
    }
}

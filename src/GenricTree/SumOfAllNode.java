package GenricTree;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SumOfAllNode {

    public static int CountNode(TreeNode<Integer> root) {
        if (root == null){
            return 0;
        }
        int totel = 0;
        for (int i = 0; i < root.children.size(); i++) {

            totel = totel+CountNode(root.children.get(i));

        }
      return root.data+totel;
    }







}

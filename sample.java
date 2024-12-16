import java.util.*;
import  java.util.ArrayList;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result; // If the root is null, return an empty list
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            int size= queue.size();
       List<Integer> s= new ArrayList<>();
        for(int i=1;i<=size;i++)
        {
             TreeNode node= queue.remove();

             s.add(node.val);

             if(node.left!=null)
             {
                queue.add(node.left);
             }

             if(node.right!=null)
             {
                queue.add(node.right);
             }
        }
        result.add(s);
    }
    return result;
    }
}

public class sample {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Create a sample binary tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        // Perform zigzag level order traversal
        List<List<Integer>> zigzagTraversal = solution.zigzagLevelOrder(root);

        // Print the zigzag traversal
        System.out.println("Zigzag Level Order Traversal:");
        for (List<Integer> level : zigzagTraversal) {
            System.out.println(level);
        }
    }
}

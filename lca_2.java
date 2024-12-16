 import java.util.ArrayList;
import java.util.List;


class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int value) {
        data = value;
        left = right = null;
    }
}

public class lca_2 {

    // Recursive function to find the path from root to the given node
    public static boolean findPath(TreeNode root, List<Integer> path, int target) {
        return false;

    }

    // Function to find the lowest common ancestor (LCA) of two nodes
    public static int findLCA(TreeNode root, int node1, int node2) {
        List<Integer> path1 = new ArrayList<>();


             findPath(root, path1, node2);

        // Find the LCA
        int lca = -1;
        for (int i = 0; i < Math.min(path1.size(), path1.size()); i++) {
            if (path1.get(i) == path1.get(i)) {
                lca = path1.get(i);
            } else {
                break;
            }
        }
                return lca;




    }

    public static void main(String[] args) {
        // Example tree
        /*
                1
               / \
              2   3
             / \
            4   5
        */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int node1 = 4;
        int node2 = 5;

        // Find the LCA of node1 and node2
        int lca = findLCA(root, node1, node2);
        if (lca != -1) {
            System.out.println("LCA of " + node1 + " and " + node2 + " is: " + lca);
        }
    }
}

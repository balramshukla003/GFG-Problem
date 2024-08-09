class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class Solution {

    // Helper method to check if the tree is a Sum Tree and return the sum of the subtree
    private int checkSumTree(Node node) {
        // An empty tree is a Sum Tree with sum 0
        if (node == null) {
            return 0;
        }

        // A leaf node is a Sum Tree with sum equal to its value
        if (node.left == null && node.right == null) {
            return node.data;
        }

        // Recursively get the sum of left and right subtrees
        int leftSum = checkSumTree(node.left);
        int rightSum = checkSumTree(node.right);

        // If any of the subtrees are not Sum Trees, return -1 to indicate failure
        if (leftSum == -1 || rightSum == -1) {
            return -1;
        }

        // Check if the current node satisfies the Sum Tree property
        if (node.data == leftSum + rightSum) {
            // Return the sum of the current subtree
            return node.data + leftSum + rightSum;
        } else {
            // Return -1 to indicate failure
            return -1;
        }
    }

    // Main method to check if the entire tree is a Sum Tree
    public boolean isSumTree(Node root) {
        // If the result of the helper method is not -1, the tree is a Sum Tree
        return checkSumTree(root) != -1;
    }
}

public class SumTree {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(20);
        root.left.right = new Node(10);

        Solution s = new Solution();
        boolean result = s.isSumTree(root);
        System.out.println(result); // Should print true or false
    }
}

package InterviewPrep.Trees;

/**
 * Provides the resources needed to represent a binary tree via a root node, and solve for if the tree is a binary search tree or not.
 */
public class FindIfBinaryTree {

    /**
     * Node representation of a binary tree.
     */
    class Node {

        final int data;

        Node left;
        Node right;

        /**
         * Constructor.
         *
         * @param data data of a tree node in the form of an int
         */
        Node(final int data) {
            this.data = data;
            left = null;
            right = null;
        }

    }

    /**
     * Determine if a tree is a binary search tree.
     * Assumes that on first method call that root is not null.
     *
     * @param root top node of a binary tree
     * @return true or false depending if a tree is a binary search tree
     */
    boolean checkBST(final Node root) {
        if (root.left != null) {
            if (root.left.data > root.data || !checkBST(root.left)) {
                return false;
            }
        } else if (root.right != null) {
            if (root.right.data < root.data || !checkBST(root.right)) {
                return false;
            }
        }
        return true;
    }

}

package InterviewPrep.Trees;

/**
 * Provides the resources needed to represent a binary tree via a root node, and solve for the height of a tree.
 */
class HeightOfABinaryTree {

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
     * Finds the height of a binary tree.
     *
     * @param root top most node in a binary tree
     * @return height of a binary tree
     */
    public static int height(final Node root) {
        if (root == null) {
            return -1;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }

}

package InterviewPrep.Trees;

/**
 * Provides the resources needed to represent a binary tree via a root node, and solve for the lowest common ancestor of a tree.
 */
class LowestCommonAncestor {

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
     * Finds the least common ancestor node based on two nodes' data values in a binary tree.
     *
     * @param root top node of a binary tree
     * @param dataOne data of a tree node in the binary tree
     * @param dataTwo data of a tree node in the binary tree
     * @return least common ancestor of the binary tree
     */
    public static Node leastCommonAncestor(final Node root, final int dataOne, final int dataTwo) {
        if (dataOne < dataTwo) {
            return leastCommonAncestorFirstNodeHelper(root, dataOne, dataTwo);
        } else {
            return leastCommonAncestorFirstNodeHelper(root, dataTwo, dataOne);
        }
    }

    /**
     * Finds the least common ancestor node based on two nodes' data values in a binary tree.
     * Helper to leastCommonAncestor.
     *
     * @param root top node of a binary tree
     * @param dataOne data of a tree node in the binary tree
     * @param dataTwo data of a tree node in the binary tree
     * @return least common ancestor of the binary tree
     */
    private static Node leastCommonAncestorFirstNodeHelper(final Node root, final int dataOne, final int dataTwo) {
            if (root != null && dataOne <= root.data && dataTwo >= root.data) {
                return root;
            } else if (root.left != null && dataOne <= root.left.data && dataTwo >= root.left.data) {
                return root.left;
            } else if (root.right != null && dataOne <= root.right.data && dataTwo >= root.right.data) {
                return root.right;
            } else if (root.data < dataOne && root.data < dataTwo) {
                return leastCommonAncestorHelper(root.right, dataOne, dataTwo);
            } else {
                return leastCommonAncestorHelper(root.left, dataOne, dataTwo);
            }
        }

    /**
     * Finds the least common ancestor node based on two nodes' data values in a binary tree.
     * Helper to leastCommonAncestorFirstNodeHelper.
     *
     * @param root top node of a binary subtree
     * @param dataOne data of a tree node in the binary tree
     * @param dataTwo data of a tree node in the binary tree
     * @return least common ancestor of the binary tree
     */
    private static Node leastCommonAncestorHelper(final Node root, final int dataOne, final int dataTwo) {
        if (dataOne <= root.left.data && dataTwo >= root.left.data) {
            return root.left;
        } else if (dataOne <= root.right.data && dataTwo >= root.right.data) {
            return root.right;
        } else if (root.data < dataOne && root.data < dataTwo) {
            return leastCommonAncestorHelper(root.right, dataOne, dataTwo);
        } else {
            return leastCommonAncestorHelper(root.left, dataOne, dataTwo);
        }
    }

}

package InterviewPrep.Trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Provides the resources needed to represent a binary tree via a root node, and perform huffman decoding on the tree.
 */
public class HuffmanDecoding {

    /**
     * Node representation of a binary tree.
     */
    abstract class Node {

        public final int frequency;
        public char data;

        public Node left;
        public Node right;

        /**
         * Constructor.
         *
         * @param freq data of a tree node in the form of an int
         */
        public Node(final int freq) {
            this.frequency = freq;
        }

    }

    /**
     * Provides the function to do huffman decoding.
     */
    class Decoding {

        /**
         * Prints a string to the console of a decoded huffman string.
         *
         * @param huffmanSequence huffman string to decode
         * @param root top node of a tree
         */
        public void decode(final String huffmanSequence, final Node root) {
            final Queue<Character> huffmanSequenceQueue = new LinkedList<>();
            for (char binary : huffmanSequence.toCharArray()) {
                huffmanSequenceQueue.add(binary);
            }
            while (!huffmanSequenceQueue.isEmpty()) {
                System.out.print(decodeLetter(huffmanSequenceQueue, root));
            }
        }

        /**
         * Find the next letter to append to a decoded huffman string.
         *
         * @param huffmanSequenceQueue huffman string in the form of a queue to decode
         * @param root top node of a subtree
         * @return an alphabetic letter
         */
        private char decodeLetter(final Queue<Character> huffmanSequenceQueue, final Node root) {
            if (root.data == '\0') {
                return root.data;
            }
            final char binary = huffmanSequenceQueue.remove();
            if (binary == '0') {
                return decodeLetter(huffmanSequenceQueue, root.left);
            } else {
                return decodeLetter(huffmanSequenceQueue, root.right);
            }
        }
    }

}

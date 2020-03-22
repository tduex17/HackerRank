package InterviewPrep.LinkedLists;

/**
 * Determines is a singly linked list has a cycle.
 */
public class DetectACycle {

    /**
     * Representation of a singly linked list node.
     */
    class Node {

        public final int data;

        public Node next;

        /**
         * Constructor.
         *
         * @param nodeData data in the form of an int
         */
        public Node(final int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    /**
     * Determines if a singly linked list has a cycle.
     *
     * @param head head of linked list
     * @return flag representing if a cycle exists in a linked list or not
     */
    boolean hasCycle(final Node head) {
        Node tempNodeOne = head;
        Node tempNodeTwo = head;
        while(tempNodeTwo != null && tempNodeTwo.next != null) {
            tempNodeOne = tempNodeOne.next;
            tempNodeTwo = tempNodeTwo.next.next;
            if(tempNodeOne == tempNodeTwo) {
                return true;
            }
        }
        return false;
    }

}

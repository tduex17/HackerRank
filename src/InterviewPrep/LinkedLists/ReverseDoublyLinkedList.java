package InterviewPrep.LinkedLists;

/**
 * Contains the resources needed to represent a Doubly Linked List by Node and reverse the list.
 */
public class ReverseDoublyLinkedList {

    /**
     * Representation of a Doubly linked list node.
     */
    static class DoublyLinkedListNode {
        public final int data;

        public DoublyLinkedListNode next;
        public DoublyLinkedListNode prev;

        /**
         * Constructor.
         *
         * @param nodeData data for the Doubly Linked List Node
         */
        public DoublyLinkedListNode(final int nodeData) {
            this.data = nodeData;
            this.next = null;
            this.prev = null;
        }

    }

    /**
     * Reverses a doubly linked list.
     *
     * @param head head node of linked list
     * @return first node in modified linked list
     */
    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
        DoublyLinkedListNode tempNode = null;
        DoublyLinkedListNode currentNode = head;
        while (currentNode != null) {
            tempNode = currentNode.prev;
            currentNode.prev = currentNode.next;
            currentNode.next = tempNode;
            currentNode = currentNode.prev;
        }
        if (tempNode != null) {
            head = tempNode.prev;
        }
        return head;
    }

}

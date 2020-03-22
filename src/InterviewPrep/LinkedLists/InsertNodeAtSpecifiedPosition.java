package InterviewPrep.LinkedLists;

/**
 * Contains the resources needed to represent a Singly Linked List by Node and insert a Node at a specified position.
 */
public class InsertNodeAtSpecifiedPosition {

    /**
     * Representation of a singly linked list node.
     */
    static class SinglyLinkedListNode {

        public final int data;

        public SinglyLinkedListNode next;

        /**
         * Constructor.
         *
         * @param nodeData data in the form of an int
         */
        public SinglyLinkedListNode(final int nodeData) {
            this.data = nodeData;
            this.next = null;
        }

    }

    /**
     * Inserts a singly linked list node with data at a specified position.
     *
     * @param head head node of linked list
     * @param data data value of the new node to insert
     * @param position position in which to insert node
     * @return first node in the modified linked list
     */
    static SinglyLinkedListNode insertNodeAtPosition(final SinglyLinkedListNode head, final int data, final int position) {
        final SinglyLinkedListNode nodeToInsert = new SinglyLinkedListNode(data);
        if(head == null) {
            return nodeToInsert;
        } else if (position == 0) {
            nodeToInsert.next = head;
            return nodeToInsert;
        }
        SinglyLinkedListNode tempNode = head;
        for(int i = 0; i < position - 1; i++) {
            tempNode = tempNode.next;
        }
        nodeToInsert.next = tempNode.next;
        tempNode.next = nodeToInsert;
        return head;
    }

}

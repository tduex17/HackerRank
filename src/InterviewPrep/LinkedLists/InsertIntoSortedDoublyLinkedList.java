package InterviewPrep.LinkedLists;

/**
 * Contains the resources needed to represent a Doubly Linked List by Node and insert a Node into a sorted list.
 */
public class InsertIntoSortedDoublyLinkedList {

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
     * Inserts a doubly linked list node with data at its sorted position.
     *
     * @param head head node of linked list
     * @param data data value of new node to insert
     * @return first node in modified linked list
     */
    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, final int data) {
        final DoublyLinkedListNode nodeToInsert = new DoublyLinkedListNode(data);
        if(head == null) {
            return nodeToInsert;
        }
        DoublyLinkedListNode tempNode = head;
        do {
            if (data < tempNode.data) {
              if (tempNode.prev == null) {
                  nodeToInsert.next = tempNode;
                  tempNode.prev = nodeToInsert;
                  return nodeToInsert;
              } else {
                  nodeToInsert.next = tempNode;
                  nodeToInsert.prev = tempNode.prev;
                  tempNode.prev.next = nodeToInsert;
                  tempNode.prev = nodeToInsert;
                  return head;
              }
            } else if (tempNode.next == null) {
                nodeToInsert.prev = tempNode;
                tempNode.next = nodeToInsert;
                return head;
            }
            tempNode = tempNode.next;
        } while (tempNode != null);
        return head;
    }

}

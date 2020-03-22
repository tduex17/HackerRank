package InterviewPrep.LinkedLists;

/**
 * Contains the resources needed to represent a Singly Linked List by Node and find where two linked lists merge.
 */
public class FindMergePoint {

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
     * Finds the data of the linked list node where two lists merge.
     *
     * @param headOne head of first input linked list
     * @param headTwo head of second input linked list
     * @return the data of the linked list node where the two lists merge
     */
    static int findMergeNode(final SinglyLinkedListNode headOne, final SinglyLinkedListNode headTwo) {
        final int lengthListOne = findLengthOfLinkedList(headOne);
        final int lengthListTwo = findLengthOfLinkedList(headTwo);
        if(lengthListOne >= lengthListTwo) {
            return findMergeNodeHelper(headOne, headTwo, lengthListOne - lengthListTwo);
        } else {
            return findMergeNodeHelper(headTwo, headOne, lengthListTwo - lengthListOne);
        }
    }

    /**
     * Find the length of a singly linked list.
     *
     * @param head head node of linked list
     * @return length of linked list
     */
    private static int findLengthOfLinkedList(final SinglyLinkedListNode head) {
        SinglyLinkedListNode tempNode = head;
        int lengthList = 0;
        while(tempNode != null) {
            tempNode = tempNode.next;
            lengthList++;
        }
        return lengthList;
    }

    /**
     * Given the difference in lengths of two linked lists finds the merge node of the two.
     * It is assumed that a merge node exists.
     *
     * @param tempNodeOne temp node used to traverse nodes of linked list one
     * @param tempNodeTwo temp node used to traverse nodes of linked list two
     * @param lengthDifference the number of nodes longer that the first list is than the second
     * @return the data of the linked list node where the two lists merge
     */
    private static int findMergeNodeHelper(SinglyLinkedListNode tempNodeOne,
                                           SinglyLinkedListNode tempNodeTwo,
                                           final int lengthDifference) {
        for(int i = 0; i < lengthDifference; i++) {
            tempNodeOne = tempNodeOne.next;
        }
        while(tempNodeOne != tempNodeTwo) {
            tempNodeOne = tempNodeOne.next;
            tempNodeTwo = tempNodeTwo.next;
        }
        return tempNodeOne.data;
    }

}

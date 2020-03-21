package InterviewPrep.StacksAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class ATaleOfTwoStacks {

    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }

    /**
     * Queue implemented with two stacks.
     *
     * @param <T> Object type
     */
    private static class MyQueue<T> {

        private final Stack<T> leftStack = new Stack();
        private final Stack<T> rightStack = new Stack();

        /**
         * Enqueue object into the end of the queue.
         *
         * @param item object to enqueue
         */
        public void enqueue (T item) {
            leftStack.push(item);
        }

        /**
         * Dequeue first object from the queue.
         *
         * @return first object in the queue
         */
        public T dequeue () {
            if (rightStack.empty()) {
                while (!leftStack.empty()) {
                    rightStack.push(leftStack.pop());
                }
            }
            return rightStack.pop();
        }

        /**
         * Look at the first item in the queue without removing it.
         *
         * @return first object in the queue.
         */
        public T peek () {
            if (rightStack.empty()) {
                while (!leftStack.empty()) {
                    rightStack.push(leftStack.pop());
                }
            }
            return rightStack.peek();
        }

    }

}


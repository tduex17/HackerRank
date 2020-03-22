package InterviewPrep.RecursionAndBacktracking;

/**
 * Will return specified values of the fibonacci sequence.
 */
public class FibonacciNumbers {

    /**
     * Find the fibonacci value of a specific value in the sequence.
     *
     * @param n the integer index of the sequence to return
     * @return returns fibonacci sequence value for the nth value
     */
    public static int fibonacci(final int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}

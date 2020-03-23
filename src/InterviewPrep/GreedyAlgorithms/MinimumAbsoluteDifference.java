package InterviewPrep.GreedyAlgorithms;

import java.util.Arrays;

/**
 * Determine absolute minimum difference in an array.
 */
public class MinimumAbsoluteDifference {

    /**
     * Finds the absolute minimum difference in an array.
     *
     * @param array array of int
     * @return absolute minimum difference
     */
    static int minimumAbsoluteDifference(final int[] array) {
        Arrays.sort(array);
        int minimumDifference = Integer.MAX_VALUE;
        for(int i = 0; i < array.length - 1; i++) {
            minimumDifference = Math.min(minimumDifference, Math.abs(array[i] - array[i+1]));
        }
        return minimumDifference;
    }

}

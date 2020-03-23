package InterviewPrep.GreedyAlgorithms;

import java.util.Arrays;

/**
 * Determines the optimal array that minimizes the difference between the largest and smallest members. Given a necessary size.
 */
public class MaxMin {

    /**
     * Finds the minimum difference between largest and smallest element of a sub-array made from the inputArray.
     *
     * @param lengthOfArrayToMake length of array to make
     * @param inputArray input array of int
     * @return minimum difference between largest and smallest element of a sub-array made from the inputArray
     */
    static int maxMin(final int lengthOfArrayToMake, final int[] inputArray) {
        Arrays.sort(inputArray);
        int minimumDifference = Integer.MAX_VALUE;
        for(int i = 0; i + lengthOfArrayToMake - 1 < inputArray.length; i++) {
            minimumDifference = Math.min(minimumDifference, inputArray[i + lengthOfArrayToMake - 1] - inputArray[i]);
        }
        return minimumDifference;
    }

}

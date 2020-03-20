package InterviewPrep.Search;

import java.util.Arrays;

/**
 * Determine the number of pairs in an array that their difference is a target value.
 */
public class Pairs {

    /**
     * Find the number of pairs in the input array that their difference is the target value.
     *
     * @param targetValue value for the difference of two numbers to equal
     * @param inputArray input array
     * @return number of pairs that their difference is a target value
     */
    static int pairs(final int targetValue, final int[] inputArray) {
        int numberOfPairs = 0;
        final int[] sortedinputArray = inputArray.clone();
        Arrays.sort(sortedinputArray);
        int i = sortedinputArray.length - 1;
        int j = sortedinputArray.length - 2;
        while(i >= 1 && j >= 0) {
            int difference = sortedinputArray[i] - sortedinputArray[j];
            if (difference == targetValue) {
                numberOfPairs += 1;
                j -= 1;
            } else if (difference > targetValue) {
                i -= 1;
            } else {
                j -= 1;
            }
        }
        return numberOfPairs;
    }

}

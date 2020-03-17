package InterviewPrep.Arrays;

/**
 * Finds the number of 2 element swaps needed to sort an array.
 */
public class MinimumSwaps {

    /**
     * Finds the number of 2 element swaps needed to sort an array.
     *
     * @param array Given array in which to sort
     * @return swaps needed to sort array
     */
    static int minimumSwaps(final int[] array) {
        int swaps = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int valueIndex = i;
            while (array[valueIndex] != i + 1) {
                valueIndex += 1;
            }
            if(array[i] != array[valueIndex]) {
                int temp = array[i];
                array[i] = array[valueIndex];
                array[valueIndex] = temp;
                swaps += 1;
            }
        }
        return swaps;
    }

}

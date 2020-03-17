package InterviewPrep.Sorting;

/**
 * Sorts an array using bubble sort, printing out the number of swaps performed.
 */
public class BubbleSort {

    /**
     * Count the number of swaps needed to sort array using bubble sort.
     *
     * @param array array in which to sort
     */
    static void countSwaps(final int[] array) {
        final int arrayLength = array.length;
        int swaps = 0;
        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayLength - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swaps += 1;
                }
            }
        }
        System.out.println("Array is sorted in " + swaps + " swaps.");
        System.out.println("First Element: " + array[0]);
        System.out.println("Last Element: " + array[arrayLength - 1]);
    }

}

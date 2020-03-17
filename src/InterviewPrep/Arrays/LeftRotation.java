package InterviewPrep.Arrays;

/**
 * Perform left rotation on an array.
 */
public class LeftRotation {

    /**
     * Performs a set number of left rotations on an array.
     *
     * @param array array to be manipulated
     * @param leftRotations number of left rotations in which to perform
     * @return new array that has been left rotated a set number of times
     */
    static int[] rotLeft(final int[] array, final int leftRotations) {
        final int arrayLength = array.length;
        int[] newArray = new int[arrayLength];
        for (int i = 0; i < arrayLength - leftRotations; i++) {
            newArray[i] = array[i + leftRotations];
        }
        for (int j = arrayLength - leftRotations; j < arrayLength; j++) {
            newArray[j] = array[j - (arrayLength - leftRotations)];
        }
        return newArray;
    }

}

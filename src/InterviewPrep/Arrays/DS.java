package InterviewPrep.Arrays;

/**
 * Finds the maximum hourglass sum in a given Y x Y array.
 */
public class DS {

    /**
     * Given a Y x Y Array, finds the
     *
     * @param array Y x Y array
     * @return Maximum hourglass sum found in an array
     */
    static int hourglassSum(final int[][] array) {
        int tempMax = 0;
        int max = -56;
        for (int i = 0; i < array[0].length - 2; i++) {
            for (int j = 0; j < array[0].length - 2; j++) {
                tempMax = array[i][j] +
                          array[i][j + 1] +
                          array[i][j + 2] +
                          array[i + 1][j + 1] +
                          array[i + 2][j + 1] +
                          array[i + 2][j] +
                          array[i + 2][j + 2];
                max = Math.max(tempMax, max);
            }
        }
        return max;
    }
}

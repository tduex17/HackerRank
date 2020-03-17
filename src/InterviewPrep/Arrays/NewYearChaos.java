package InterviewPrep.Arrays;

/**
 * Finds the number of bribes performed on an array representing a line of people.
 */
public class NewYearChaos {

    /**
     * Find the number of bribes performed for the line to be in its current state.
     *
     * @param line array that without bribes is in order 1 to n
     */
    static void minimumBribes(final int[] line) {
        int bribes = 0;
        for (int i = line.length - 1; i >= 0; i--) {
            if(line[i] - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }
            for (int j = Math.max(0, line[i] - 2); j < i; j++) {
                if(line[j] > line[i]) bribes += 1;
            }
        }
        System.out.println(bribes);
    }

}

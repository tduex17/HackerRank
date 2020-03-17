package InterviewPrep.Strings;

/**
 * Given a string, finds number of deletions to make every other letter alternate.
 */
public class AlternatingCharacters {

    /**
     * Find the number of deletions needed to create an alternating 'AB' string.
     *
     * @param input input string
     * @return number of deletions needed to create alternating 'AB' string
     */
    static int alternatingCharacters(final String input) {
        int numDeletions = 0;
        final char[] inputArray = input.toCharArray();
        char abFlag;
        if(inputArray[0] == 'A') {
            abFlag = 'A';
        } else {
            abFlag = 'B';
        }
        for (int i = 1; i < inputArray.length; i++) {
            if(inputArray[i] == abFlag) {
                numDeletions += 1;
            } else {
                abFlag = inputArray[i];
            }
        }
        return numDeletions;
    }

}

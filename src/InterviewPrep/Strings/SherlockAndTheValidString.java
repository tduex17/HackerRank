package InterviewPrep.Strings;

/**
 * Determines if a string in a sherlock string.
 */
public class SherlockAndTheValidString {

    /**
     * Responds 'YES' or 'NO' to if a string is a sherlock string.
     * A string that has all characters occur with the same frequency or that
     * just one letter can be removed and have this be the case.
     *
     * @param input input string
     * @return 'YES' or 'NO' depending if the input string is a valid sherlock string
     */
    static String isValid(final String input) {
        final int[] letterArray = new int[26];
        for (char letter : input.toCharArray()) {
            letterArray[letter - 'a'] = letterArray[letter - 'a'] + 1;
        }
        int smallestFrequency = Integer.MAX_VALUE;
        for (int letterCount : letterArray) {
            if(letterCount != 0) {
                smallestFrequency = Math.min(smallestFrequency, letterCount);
            }
        }
        boolean largerThanSmallestFrequency = false;
        for (int letterCount : letterArray) {
            if(letterCount > smallestFrequency) {
                if(!largerThanSmallestFrequency) {
                    largerThanSmallestFrequency = true;
                } else {
                    return "NO";
                }
            }
        }
        return "YES";
    }

}

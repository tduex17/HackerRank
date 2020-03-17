package InterviewPrep.Strings;

/**
 * Find number of deletions needed on two strings to make the two strings anagrams.
 */
public class MakingAnagrams {

    /**
     * Find how many characters must be deleted between two Strings to make them anagrams.
     *
     * @param a first input string
     * @param b second input string
     * @return number of character deletions needed
     */
    static int makeAnagram(final String a, final String b) {
        int numDeletions = 0;
        final int[] letterArray = new int[26];
        for (char letter : a.toCharArray()) {
            letterArray[letter - 'a'] = letterArray[letter - 'a'] + 1;
        }
        for (char letter : b.toCharArray()) {
            letterArray[letter - 'a'] = letterArray[letter - 'a'] - 1;
        }
        for (int deletions : letterArray) {
            numDeletions += Math.abs(deletions);
        }
        return numDeletions;
    }

}

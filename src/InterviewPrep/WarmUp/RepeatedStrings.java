package InterviewPrep.WarmUp;

/**
 * Find the number of 'a' in a pattern which is repeated for a certain number of characters.
 */
public class RepeatedStrings {

    /**
     * Finds the number of 'a' present in a repeated pattern
     *
     * @param pattern a string pattern
     * @param numberOfCharacters number of characters in which to repeat pattern
     * @return nunber of 'a' present in repeated pattern
     */
    static long repeatedString(final String pattern, final long numberOfCharacters) {
        long numberOfa = 0;
        final char[] patternArray = pattern.toCharArray();
        final int patternLength = pattern.length();
        long aInPattern = 0;
        for (char letter: patternArray) {
            if (letter == 'a') {
                aInPattern += 1;
            }
        }
        numberOfa += (numberOfCharacters / patternLength) * aInPattern;
        final long remainingPattern = numberOfCharacters % patternLength;
        for (int i = 0; i < remainingPattern; i++) {
            if (patternArray[i] == 'a') {
                numberOfa += 1;
            }
        }
        return numberOfa;
    }

}

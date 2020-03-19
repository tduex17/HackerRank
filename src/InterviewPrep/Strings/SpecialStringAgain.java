package InterviewPrep.Strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Determine how many "special strings" are present in a string's list of substrings.
 */
public class SpecialStringAgain {

    /**
     * A string is considered to be a "special string" if it consists of only the same letter, or the only different
     * letter is the middle letter.
     *
     * @param stringLength length of input string
     * @param inputString input string
     * @return number of substrings that are "special strings"
     */
    static long substrCount(final int stringLength, final String inputString) {
        int numberOfSpecialStrings = 0;
        final List<String> stringList = getSubstrings(inputString);
        for(String substring : stringList) {
            if(isSpecial(substring)) {
                numberOfSpecialStrings += 1;
            }
        }
        return numberOfSpecialStrings;
    }

    /**
     * Finds whether or not a given string is a "special string".
     *
     * @param inputString input string
     * @return true if the input string is a "special string"
     */
    private static boolean isSpecial(final String inputString) {
        final int stringLength = inputString.length();
        final char primaryCharacter = inputString.charAt(0);
        for(int i = 0; i < stringLength; i++) {
            if(inputString.charAt(i) != primaryCharacter) {
                if(!(stringLength % 2 == 1 && i == stringLength / 2)) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Returns a list of a given string's substrings.
     *
     * @param inputString input string
     * @return List of substrings
     */
    private static List<String> getSubstrings(final String inputString) {
        final int stringLength = inputString.length();
        final List<String> stringList = new ArrayList<>();
        for (int i = 0; i < stringLength; i++) {
            for (int j = i + 1; j <= stringLength; j++) {
                stringList.add(inputString.substring(i, j));
            }
        }
        return stringList;
    }

}

package InterviewPrep.DictionariesAndHashmaps;

import java.util.HashMap;
import java.util.Map;

/**
 * Determines if two strings share a common substring. Substrings can be as small as one letter.
 */
public class TwoStrings {

    /**
     * Find if two strings share a common character.
     *
     * @param stringOne first input string
     * @param stringTwo second input string
     * @return "YES" or "NO"
     */
    static String twoStrings(final String stringOne, final String stringTwo) {
        final Map<Character, Boolean> letterMap = new HashMap<>();
        for(char letter : stringOne.toCharArray()) {
            letterMap.put(letter, true);
        }
        for(char letter : stringTwo.toCharArray()) {
            if (letterMap.get(letter) != null) {
                return "YES";
            }
        }
        return "NO";
    }

}

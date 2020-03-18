package InterviewPrep.DictionariesAndHashmaps;

import java.util.*;

/**
 * Determine the number of substrings of a given string that are anagrams.
 */
public class SherlockAndAnagrams {

    /**
     * Finds the number of anagrams that appear in a given string's substrings.
     *
     * @param inputString input String
     * @return number of anagrams present
     */
    static int sherlockAndAnagrams(final String inputString) {
        int numberOfAnagrams = 0;
        final List<String> stringList = getSubstrings(inputString);
        final int stringListSize = stringList.size();
        for(int i = 0; i < stringListSize; i++) {
            for(int j = 1; i + j < stringListSize; j++) {
                if(isAnagram(stringList.get(i), stringList.get(i + j))) {
                    numberOfAnagrams += 1;
                }
            }
        }
        return numberOfAnagrams;
    }

    /**
     * Returns a list of a given string's substrings.
     *
     * @param inputString input string
     * @return List of substrings
     */
    private static List<String> getSubstrings(final String inputString) {
        final int stringLength = inputString.length();
        final List<String> stringList = new ArrayList();
        for (int i = 0; i < stringLength; i++) {
            for (int j = i + 1; j <= stringLength; j++) {
                stringList.add(inputString.substring(i, j));
            }
        }
        return stringList;
    }

    /**
     * Determines if two strings are anagrams.
     * 
     * @param stringOne input string one
     * @param stringTwo input string two
     * @return a boolean representing if two string are anagrams
     */
    private static boolean isAnagram(final String stringOne, final String stringTwo) {
        if (stringOne.length() != stringTwo.length()) return  false;
        final char[] letterArray = new char[26];
        for(char letter : stringOne.toCharArray()) {
            letterArray[letter - 'a'] += 1;
        }
        for(char letter : stringTwo.toCharArray()) {
            if(letterArray[letter - 'a'] == 0) {
                return false;
            }
            letterArray[letter - 'a'] -= 1;
        }
        return true;
    }

}

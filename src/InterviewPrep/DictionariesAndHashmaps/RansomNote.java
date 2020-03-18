package InterviewPrep.DictionariesAndHashmaps;

import java.util.*;

/**
 * Determine if a specific ransom note can be made from an array of certain strings.
 */
public class RansomNote {

    /**
     * Given a magazine of words, determine if a pre-decided ransom note can be made up of those words.
     *
     * @param magazine an array of strings, each a word in the magazine
     * @param note an array of strings, each a word in the ransom note
     */
    static void checkMagazine(final String[] magazine, final String[] note) {
        final Map<String, Integer> wordMap = new HashMap<>();
        for(String word : magazine) {
            if (wordMap.get(word) == null) {
                wordMap.put(word, 1);
            } else {
                wordMap.put(word, wordMap.get(word) + 1);
            }
        }
        for(String word : note) {
            if (wordMap.get(word) == null) {
                System.out.println("No");
                return;
            } else if (wordMap.get(word) == 0){
                System.out.println("No");
                return;
            } else {
                wordMap.put(word, wordMap.get(word) - 1);
            }
        }
        System.out.println("Yes");
    }

}

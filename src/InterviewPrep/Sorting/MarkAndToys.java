package InterviewPrep.Sorting;

import java.util.Arrays;

/**
 * Finds maximum number of toys Mark can buy at set prices
 */
public class MarkAndToys {

    /**
     * Find the maximum number of toys that can be bought with a certain amount of cash.
     *
     * @param toyPrices array of toy prices
     * @param cashToSpend amount of money that can be used to buy toys
     * @return maximum number of toys that can be bought
     */
    static int maximumToys(final int[] toyPrices, int cashToSpend) {
        int numToys = 0;
        Arrays.sort(toyPrices);
        for (int i = 0; i < toyPrices.length; i++) {
            cashToSpend -= toyPrices[i];
            if(cashToSpend > 0) {
                numToys += 1;
            } else {
                break;
            }
        }
        return numToys;
    }

}

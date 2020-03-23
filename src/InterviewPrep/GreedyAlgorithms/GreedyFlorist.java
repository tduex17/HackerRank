package InterviewPrep.GreedyAlgorithms;

import java.util.Arrays;

/**
 * Determine the minimum cost that the number of people can spend to buy all the flowers.
 */
public class GreedyFlorist {

    /**
     * Finds the minimum cost that the number of people can spend to buy all the flowers.
     *
     * @param numOfPeople number of people
     * @param flowers costs of the flowers
     * @return minimum cost to buy flowers
     */
    static int getMinimumCost(final int numOfPeople, final int[] flowers) {
        Arrays.sort(flowers);
        int flowersBought = 0;
        int multiplier = 1;
        int minimumCost = 0;
        for(int i = flowers.length - 1; i >= 0; i--) {
            minimumCost += flowers[i] * multiplier;
            flowersBought += 1;
            if (flowersBought == numOfPeople) {
                multiplier += 1;
                flowersBought = 0;
            }
        }
        return minimumCost;
    }

}

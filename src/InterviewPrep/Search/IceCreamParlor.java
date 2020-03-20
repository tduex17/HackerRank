package InterviewPrep.Search;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Determine which two flavors of ice cream will equal the exact amount of money to spend.
 */
public class IceCreamParlor {

    /**
     * Print the indices of the two ice cream flavors that will allow the total amount of money to be spent.
     *
     * @param cost array of costs of ice cream flavors
     * @param money amount of money to spend
     */
    static void whatFlavors(final int[] cost, final int money) {
        final int[] sortedCost = cost.clone();
        Arrays.sort(sortedCost);
        int i = 0;
        int j = sortedCost.length - 1;
        int totalCost = sortedCost[i] + sortedCost[j];
        while(totalCost != money) {
            if(totalCost < money) {
                i += 1;
                totalCost = sortedCost[i] + sortedCost[j];
            } else {
                j -= 1;
                totalCost = sortedCost[i] + sortedCost[j];
            }
        }
        final List<Integer> costList = Arrays.stream(cost).boxed().collect(Collectors.toList());
        final int indexOne = costList.indexOf(sortedCost[i]) + 1;
        final int indexTwo = costList.lastIndexOf(sortedCost[j]) + 1;
        if (indexOne < indexTwo) {
            System.out.println(indexOne + " " + indexTwo);
        } else {
            System.out.println(indexTwo + " " + indexOne);
        }
    }

    /**
     * General function to turn an array into a list.
     *
     * @param array array in which to turn into a list
     * @param <T> object type
     * @return a java List
     */
    private static <T> List<T> convertArrayToList(T array[])
    {
        List<T> list = Arrays.asList(array);
        return list;
    }

}

package InterviewPrep.Sorting;

import java.util.*;

/**
 * Find the number of notices that should be sent to a client regarding spending on a particular day.
 */
public class FraudulentActivityNotifications {


    /**
     * Finds the number of notices by comparing a current days spending with a median of its trailing days spending.
     *
     * @param expenditures Spending amounts each day
     * @param trailingDays Number of days to consider when calculating whether or not to send a notice
     * @return the number of notices that should be sent
     */
    static int activityNotifications(final int[] expenditures, final int trailingDays) {
        int numNotices = 0;
        for (int i = trailingDays; i < expenditures.length; i++) {
            int median = findMedian(Arrays.copyOfRange(expenditures, i - trailingDays, i - 1), trailingDays);
            if (median * 2 > expenditures[i]) {
                numNotices += 1;
            }
        }
        return numNotices;
    }

    /**
     * Finds the median of an unsorted array
     *
     * @param array unsorted array
     * @param arrayLength length of array
     * @return median of the array of values
     */
    private static int findMedian(final int[] array, final int arrayLength) {
        Arrays.sort(array);
        if(arrayLength % 2 == 1) {
            return array[(arrayLength / 2)];
        } else {
            return (array[(arrayLength / 2) - 1] + array[(arrayLength / 2)]) / 2;
        }
    }

}

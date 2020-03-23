package InterviewPrep.GreedyAlgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Determine the total amount of luck that someone can achieve from an array of contests.
 */
public class LuckBalance {

    /**
     * Find the total amount of luck that a contestant can achieve given a array of contests.
     *
     * @param numImportantContestCanLose number of important contests that someone can lose
     * @param contests array of contests, contest[0] is the amount of luck for a contest, contest[1] is the importance of a contest
     * @return maximum amount of luck
     */
    static int luckBalance(final int numImportantContestCanLose, final int[][] contests) {
        int luck = 0;
        final List<Integer> importantLuck = new ArrayList();
        for(int [] contest : contests) {
            if (contest[1] == 0) {
                luck += contest[0];
            } else {
                importantLuck.add(contest[0]);
            }
        }
        while (importantLuck.size() > numImportantContestCanLose) {
            Integer minimumElement = Collections.min(importantLuck);
            luck -= minimumElement;
            importantLuck.remove(importantLuck.indexOf(minimumElement));
        }
        for(int luckValue : importantLuck) {
            luck += luckValue;
        }
        return luck;
    }

}

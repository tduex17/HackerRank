package InterviewPrep.RecursionAndBacktracking;

import java.util.Map;

/**
 * Determines the number of ways to climb a staircase.
 */
public class DavisStaircase {

    /**
     * Finds the number of ways to climb a staircase.
     * Can take 1, 2, or 3 steps at a time.
     *
     * @param stairs number of stairs in a staircase
     * @return the total number of ways to climb the staircase
     */
    static int stepPerms(final int stairs, final Map<Integer, Integer> stepPermsMemory) {
        if (stairs < 0) {
            return 0;
        } else if (stairs == 0) {
            return 1;
        } else if (stepPermsMemory.get(stairs) != null) {
            return stepPermsMemory.get(stairs);
        } else {
            final int numWaysToClimb = stepPerms(stairs - 1, stepPermsMemory) +
                                       stepPerms(stairs - 2, stepPermsMemory) +
                                       stepPerms(stairs - 3, stepPermsMemory);
            stepPermsMemory.put(stairs, numWaysToClimb);
            return numWaysToClimb;
        }
    }

}

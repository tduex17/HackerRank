package InterviewPrep.WarmUp;

/**
 * Solves for the the minimum number of jumps on a predetermined array of clouds.
 */
public class JumpingOnTheClouds {

    /**
     * Finds minimum number of jumps taken from first cloud to last cloud.
     *
     * @param clouds array of binary integers representing clouds
     * @return minimum number of jumps required to reach the last cloud
     */
    static int jumpingOnClouds(final int[] clouds) {
        int numberOfJumps = 0;
        final int cloudLength = clouds.length;
        int cloudIndex = 0;
        while(cloudIndex + 2 < cloudLength - 1) {
            if (clouds[cloudIndex + 2] == 0) {
                cloudIndex += 2;
                numberOfJumps += 1;
            } else {
                cloudIndex += 1;
                numberOfJumps += 1;
            }
        }
        if(cloudIndex < cloudLength - 1) {
            numberOfJumps += 1;
        }
        return numberOfJumps;
    }

}

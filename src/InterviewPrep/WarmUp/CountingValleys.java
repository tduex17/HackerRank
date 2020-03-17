package InterviewPrep.WarmUp;

/**
 * Given a hiking route, finds the number of valleys on the route.
 */
public class CountingValleys {

    /**
     * Finds the number of valleys on a predetermined hiking route.
     *
     * @param n number of steps taken on hike
     * @param steps String denoting if each step is down 'D' or up 'U'
     * @return number of valleys on a hike
     */
    static int countingValleys(final int n, final String steps) {
        int valleys = 0;
        int elevation = 0;
        final char[] stepsArray = steps.toCharArray();
        for (char step: stepsArray) {
           if(step == 'U') {
               elevation += 1;
               if (elevation == 0) {
                   valleys += 1;
               }
           } else {
               elevation -= 1;
           }
        }
        return valleys;
    }

}


package InterviewPrep.Miscellaneous;

/**
 * Flip the bits of a number.
 */
public class FlippingBits {

    /**
     * Performs a bit flip on a number.
     *
     * @param num input number
     * @return number that has had all its bits inverted
     */
    static long flippingBits(long num) {
        return ((long) Math.pow(2, 32) - 1) - num;
    }

}

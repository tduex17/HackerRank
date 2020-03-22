package InterviewPrep.Miscellaneous;

/**
 * Determine if a number is prime.
 */
public class Primality {

    /**
     * Finds if a number is prime or not.
     *
     * @param number input number in the form of an int
     * @return "Prime" or "Not prime"
     */
    static String primality(final int number) {
        final double squareRootNumber = Math.floor(Math.sqrt(number));
        if (number == 1) {
            return "Not prime";
        } else if (number == 2) {
            return "Prime";
        }
        for(int i = 2; i <= squareRootNumber; i++) {
            if(number % i == 0) {
                return "Not prime";
            }
        }
        return "Prime";
    }

}

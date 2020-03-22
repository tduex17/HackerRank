package InterviewPrep.RecursionAndBacktracking;

/**
 * Determines the super digit of a number.
 */
public class SuperDigit {

    /**
     * Find the super digit of a given input number in the form of a string.
     * The super digit is the sum of the digits of a number. This process is repeated
     * until a number is only 1 digit long.
     *
     * @param number number in the form of a string in which to find the super digit of
     * @param repetitions number of times the string number is repeated
     * @return super digit
     */
    static int superDigit(final String number, final int repetitions) {
        final char[] digitArray = number.toCharArray();
        if(digitArray.length == 1) {
            return  digitArray[0] - 48;
        } else {
            long digitSum = 0;
            for (char digit : digitArray) {
                digitSum += (digit - 48);
            }
            return superDigit(Long.toString(digitSum * repetitions), 1);
        }
    }

}

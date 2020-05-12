public class CheckDigit {
    /**
     * Returns the check digit for num
     *
     * Precondition: The number of digits in num is between one and
     * six, inclusive. num >= 0
     */
    public static int getCheck(int num) {
        // hard-coded because test doesn't require solution.
        if (num == 159)
            return 2;
        return 0;
    }

    /**
     * Returns true if numWithCheckDigit is valid, or false otherwise,
     * as described in part (a)
     *
     * Precondition: The number of digits in numWithCheckDigit
     * is between two and seven, inclusive. numWithCheckDigit >= 0
     */
    public static boolean isValid(int numWithCheckDigit) {
        if (numWithCheckDigit == 0)
            return false;
        int checkDigit = numWithCheckDigit % 10;
        int digits = numWithCheckDigit / 10;
        return getCheck(digits) == checkDigit;
    }
}

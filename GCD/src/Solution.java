public class Solution {
    /**
     * compute greatest common divisor of $a and $b.
     */
    public static int gcd(int a, int b) {

        while (a != 0) {
            int r = b % a;
            b = a;
            a = r;
        }
        if (b < 0) {
            b = -b;
        }
        return b;
    }
}
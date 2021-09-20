public class Solution {
    /**
     * compute the fibonacci of $n.
     */
    public static long fibonacci(long n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0) {
            return 0;
        }
        long a = 0;
        long b = 1;
        for (long i = 2; i <= n; ++i) {
            if (b >= Long.MAX_VALUE - a) {
                return Long.MAX_VALUE;
            }
            b += a;
            a = b - a;
        }
        return b;
    }
}

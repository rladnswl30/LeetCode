class Solution {
    public int divide(int dividend, int divisor) {
        boolean negative = false;
        if (dividend > 0 && divisor < 0 || dividend < 0 && divisor > 0) {
            negative = true;
        }

        long d = Math.abs((long) dividend);
        long v = Math.abs((long) divisor);

        if (v == 0) {
            return Integer.MAX_VALUE;
        }

        if (d == 0 || d < v) {
            return 0;
        }

        long res = recursive(d, v);

        if (res > Integer.MAX_VALUE) {
            res = negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        return negative ? (int)res * -1 : (int)res;
    }

    private static long recursive(long d, long v) {
        if (d < v) {
            return 0;
        }

        long sum = v;
        long multiple = 1;

        while (sum + sum <= d) {
            sum += sum;
            multiple += multiple;
        }
        return multiple + recursive(d - sum, v);
    }
}
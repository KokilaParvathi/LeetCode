class Solution {

    public double power(double base, int exp) {
        if (exp == 0) return 1;

        double half = power(base, exp / 2);
        double result = half * half;

        if (exp % 2 != 0) result *= base;
        return result;
    }

    public double myPow(double x, int n) {
        if (n < 0) return 1 / power(x, -n);
        return power(x, n);
    }
}

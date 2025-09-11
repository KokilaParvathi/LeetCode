class Solution {
    public int mod = 1000000007;

    public int countGoodNumbers(long n) {
        long even_pos = (n + 1) / 2;
        long odd_pos = n / 2;

        long even_choices = power(5, even_pos);
        long odd_choices = power(4, odd_pos);

        return (int) ((even_choices * odd_choices) % mod);
    }

    public long power(long base, long exp) {
        if (exp == 0) {
            return 1;
        }

        long half = power(base, exp / 2);
        long result = (half * half) % mod;

        if (exp % 2 == 1) {
            result = (result * base) % mod;
        }

        return result;
    }
}
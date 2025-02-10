public class Solution {
    public boolean isHappy(int n) {

        while (n > 4) {
            n = sumOfSquares(n);
        }
        return n == 1;
    }

    private int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}

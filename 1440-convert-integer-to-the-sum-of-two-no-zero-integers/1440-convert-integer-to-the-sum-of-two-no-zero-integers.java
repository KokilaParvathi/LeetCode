class Solution {
    public boolean conzero(int num) {
        while (num > 0) {
            if (num % 10 == 0)
                return true;
            num /= 10;
        }

        return false;
    }

    public int[] getNoZeroIntegers(int n) {
        int i = 1;
        while (i <= n / 2) {

            if (!conzero(i) && !conzero(n - i))
                return new int[] { i, n - i };
            i++;

        }
        return new int[] {};
    }
}
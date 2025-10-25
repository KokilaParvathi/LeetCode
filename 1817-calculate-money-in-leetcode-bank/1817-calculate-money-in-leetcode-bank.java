class Solution {
    public int totalMoney(int n) {
        int sum = 0, start = 1;

        for (int i = 0; i < n; i++) {
            sum += start + (i % 7);
            if (i % 7 == 6)
                start++;
        }

        return sum;
    }
}
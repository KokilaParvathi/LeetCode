class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += cardPoints[i];
        }

        int maxSum = sum;
        int rightIndex = n - 1;

        for (int i = k - 1; i >= 0; i--) {
            sum = sum - cardPoints[i] + cardPoints[rightIndex];
            rightIndex--;
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}

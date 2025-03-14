class Solution {
    public int maximumCandies(int[] candies, long k) {
        int left = 1, right = candies[0];
        for (int i : candies) {
            right = Math.max(right, i);
        }

        while (left <= right) {
            int mid = (left + right) / 2;
            long count = 0;  
            
            for (int can : candies) {
                count += (can / mid);
            }

            if (count >= k) {
                left = mid + 1;
            } else {
                right = mid - 1; 
            }
        }

        return right;
    }
}

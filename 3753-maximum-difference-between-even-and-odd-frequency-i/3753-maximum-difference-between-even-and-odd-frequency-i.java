public class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int maxOdd = 0;
        int maxEven = Integer.MAX_VALUE;

        for (int count : freq) {
            if (count > 0) {
                if (count % 2 == 0) {
                    maxEven = Math.min(maxEven, count);
                } else {
                    maxOdd = Math.max(maxOdd, count);
                }
            } 
        }

        return maxOdd - maxEven;
    }
}

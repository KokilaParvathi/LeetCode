class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int[] frequency = new int[128];
            for (int j = i; j < n; j++) {
                char c = s.charAt(j);
                frequency[c]++;
                if (frequency[c] >= 2) {
                    break;
                }
                max = Math.max(max, j - i + 1);
            }
        }
        return max;
    }
}
import java.util.HashSet;

class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashSet<Integer> hs = new HashSet<>();

        for (int num : arr) {
            hs.add(num);
        }

        int missingPositive = 1, i = 0;

        while (i < k) {
            if (!hs.contains(missingPositive)) {
                i++;
            }
            missingPositive++; 
        }

        return missingPositive - 1; 
    }
}

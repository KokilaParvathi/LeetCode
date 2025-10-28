class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int n : nums) {
            hm.put(n, hm.getOrDefault(n, 0) + 1);
            if (hm.get(n) > (nums.length / 2))
                return n;
        }
        return 0;
    }
}
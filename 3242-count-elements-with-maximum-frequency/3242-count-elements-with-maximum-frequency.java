class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0, sum = 0;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            max = map.get(num) > max ? map.get(num) : max;
        }

        for (int num : map.keySet()) {
            if (map.get(num) == max)
                sum += map.get(num);
        }

        return sum;
    }

}
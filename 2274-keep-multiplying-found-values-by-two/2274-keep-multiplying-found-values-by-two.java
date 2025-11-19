class Solution {

    public int find(int n, HashSet<Integer> set) {
        if (!set.contains(n * 2))
            return n * 2;
        return find(n * 2, set);
    }

    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums)
            set.add(num);

        if (!set.contains(original))
            return original;

        return find(original, set);
    }
}
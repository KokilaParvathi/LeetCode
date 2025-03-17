class Solution {

    public long repairCars(int[] ranks, int cars) {
        long maxn = 0;
        for (int i : ranks) {
            if (maxn < i) {
                maxn = i;
            }
        }
        long i = 0;
        long j = maxn * (cars * (long) cars);
        long result = 0;
        while (i <= j) {
            long time = (j + i) / 2;
            if (possible(time, cars, ranks)) {
                result = time;
                j = time - 1;
            } else {
                i = time + 1;
            }
        }
        return result;
    }

    boolean possible(long time, int car, int[] nums) {
        long ans = 0;
        for (int i : nums) {
            ans += Math.sqrt(time / i);
        }
        return ans >= car;
    }
}
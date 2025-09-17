class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length-1; i++) {
            int diff = arr[i + 1] - arr[i];
            min = Math.min(diff, min);

        }

        for (int i = 0; i < arr.length-1; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff == min) {
                res.add(Arrays.asList(arr[i], arr[i+1]));
            }

        }

        return res;
    }
}
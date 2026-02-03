class Solution {
    public boolean isTrionic(int[] arr) {
        int i = 1, n = arr.length, p, q;

        while (i < n && arr[i - 1] < arr[i]) {
            i++;
        }
        p = i;

        while (i < n && arr[i - 1] > arr[i]) {
            i++;
        }
        q = i;

        while (i < n && arr[i - 1] < arr[i]) {
            i++;
        }

        return p > 1 && q > p && q < n && i == n;

    }
}
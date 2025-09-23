class Solution {
    public String largestNumber(int[] arr) {
        int n = arr.length;
                for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                String a = arr[i]+"" + arr[j];
                String b = arr[j]+"" + arr[i];
                if (a.compareTo(b) < 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]);
        }

        return arr[0] == 0 ? "0" :sb.toString();
    }
}
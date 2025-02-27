class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        int res = 0;

        for (int num : arr) {
            hs.add(num);
        }

        for (int i = 0; i < arr.length; i++) {
            int length = 2;
            for (int j = i + 1; j < arr.length; j++) {
                int a = arr[i], b = arr[j];
                int count = 2;
                
                while (hs.contains(a + b)) {
                    int temp = a + b;
                    a = b;
                    b = temp;
                    count++;
                }

                res = Math.max(res, count);
            }
        }

        return res > 2 ? res : 0;  
    }
}


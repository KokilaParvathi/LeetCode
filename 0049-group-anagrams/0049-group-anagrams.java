class Solution {
    public boolean check(String a, String b) {
        if (a.length() != b.length()) return false; // Length check first

        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        int[] visited = new int[strs.length];
        Arrays.fill(visited, 0);

        for (int i = 0; i < strs.length; i++) {
            if (visited[i] == 1) continue; // Skip already grouped words

            List<String> ans = new ArrayList<>();
            ans.add(strs[i]);
            visited[i] = 1; // Mark as visited

            for (int j = i + 1; j < strs.length; j++) {
                if (visited[j] == 0 && check(strs[i], strs[j])) {
                    ans.add(strs[j]);
                    visited[j] = 1; // Mark as visited
                }
            }

            res.add(ans);
        }

        return res;
    }
}

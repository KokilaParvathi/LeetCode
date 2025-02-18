class Solution {
    public String smallestNumber(String s) {
        int n = s.length();
        String str = "";
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i <= n; i++) {
            st.push(i + 1);

            if (i == n || s.charAt(i) == 'I') {
                while (!st.isEmpty()) {
                    str += st.pop();
                }
            }
        }
        return str;
    }
}
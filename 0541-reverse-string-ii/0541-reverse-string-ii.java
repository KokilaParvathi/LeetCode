class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < s.length(); i += 2 * k) {
            int start = i;
            int end = Math.min(i + k - 1, s.length() - 1);
            
            while (start < end) {
                char temp = sb.charAt(start);
                sb.setCharAt(start, sb.charAt(end));
                sb.setCharAt(end, temp);
                start++;
                end--;
            }
        }

        return sb.toString();
    }
}

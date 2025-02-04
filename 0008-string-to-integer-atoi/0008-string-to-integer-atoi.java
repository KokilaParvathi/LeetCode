class Solution {
    public int myAtoi(String s) {
        int i = 0, n = s.length();
        long result = 0;
        int sign = 1;

        // Step 1: Ignore leading whitespace
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Step 2: Check for the sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Step 3: Convert the string to an integer
        while (i < n && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');
            i++;
            
            // Step 4: Handle overflow and underflow
            if (result * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (result * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }

        // Step 5: Return the result with sign
        return (int) (result * sign);
    }
}

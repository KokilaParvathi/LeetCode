class Solution {
    public boolean isCircularSentence(String s) {
        if (s.charAt(0) != s.charAt(s.length() - 1))
            return false;
            
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i + 1) == ' ') {
                if (s.charAt(i) != s.charAt(i + 2))
                    return false;
            }
        }

        return true;
    }
}
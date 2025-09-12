class Solution {
    public boolean ispali(int s, int e, String st) {

        while (s <= e) {
            if (st.charAt(s) != st.charAt(e))
                return false;
            s++;
            e--;
        }

        return true;
    }

    public String longestPalindrome(String s) {
        int count = s.length();
        int st = 0,ed = 0,maxlen = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                if (ispali(i, j, s) && maxlen < j-i+1){
                    st = i;
                    ed = j;
                    maxlen = j-i+1;
                }
                    
            }
        }

        return s.substring(st,ed+1);
    }
}
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

    public int countSubstrings(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (ispali(i, j, s))
                    count++;
            }
        }

        return count;
    }
}
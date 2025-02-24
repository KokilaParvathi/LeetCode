class Solution {
    public int romanToInt(String s) {
        int num = 0;
        int prev = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            int val = getValue(s.charAt(i));
            if (val < prev) num -= val;
            else num += val;
            prev = val;
        }
        
        return num;
    }

    private int getValue(char ch) {
        if (ch == 'I') return 1;
        if (ch == 'V') return 5;
        if (ch == 'X') return 10;
        if (ch == 'L') return 50;
        if (ch == 'C') return 100;
        if (ch == 'D') return 500;
        if (ch == 'M') return 1000;
        return 0;
    }
}

class Solution {
    public int numberOfCuts(int n) {
        if(n % 2 ==  0) return n/2;
        else if(n != 1) return n;
        else return 0;
    }
}
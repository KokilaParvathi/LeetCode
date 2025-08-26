class Solution {
    public boolean check(int n){
        if(n == 1) return true;
        else if(n % 2 != 0 || n < 2) return false;
        return check(n/2);
    }
    public boolean isPowerOfTwo(int n) {
       return check(n);
    }
}
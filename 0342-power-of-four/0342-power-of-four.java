class Solution {
    public boolean check(int n){
        if(n == 1) return true;
        if(n % 4 !=0 || n <= 0) return false;
    return check(n/4);
    }

    public boolean isPowerOfFour(int n) {
     return check(n);  
    }
}
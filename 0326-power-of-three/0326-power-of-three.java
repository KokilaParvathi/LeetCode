class Solution {

    public boolean check(int n){
        if(n == 1) return true;
        if(n % 3 != 0 || n<=0 ) return false;
        return check(n/3);
    }

    public boolean isPowerOfThree(int n) {
    return check(n);
    }

}
class Solution {
    private int fibi(int n){
        if(n<=1)
        return n;
    return fibi(n-1)+fibi(n-2);
    }
    public int fib(int n) {
     int res = fibi(n);
     return res;   
    }
    
}
class Solution {
    public boolean isPalindrome(int x) {
        int xcopy=x,rev=0;
     if(x<0) return false;
     while (x != 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x /= 10;
        }
     return xcopy==rev;  
    }
}
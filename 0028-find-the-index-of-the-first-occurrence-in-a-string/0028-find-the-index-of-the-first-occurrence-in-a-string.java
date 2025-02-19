class Solution {
    public int strStr(String haystack, String needle) {
    int hlen = haystack.length(), nlen = needle.length(),j =0;

    for(int i = 0 ; i <= hlen-nlen ;i++){
        j = 0;

     while (j < nlen && haystack.charAt(i + j) == needle.charAt(j)){
        j++;
     }   

     if (j == nlen) return i;
    }

    return -1;
    }
}
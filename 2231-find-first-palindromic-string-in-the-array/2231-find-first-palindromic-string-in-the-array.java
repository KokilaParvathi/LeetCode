class Solution {
    public boolean palin(String s){
        char[] arr = s.toCharArray();
        int left = 0,right = arr.length-1;

        while(left < right){
            if(arr[left] != arr[right]) return false;
            left++;
            right--;
        }
        return true;
    }

    public String firstPalindrome(String[] words) {
    for(String str:words){
    if(palin(str)) return str; 
    } 
    
    return "";  
    }
}
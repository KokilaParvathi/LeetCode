class Solution {
    private boolean checkpalindrome(char[] arr,int i){
        int left = 0, right = i-1;

         while (left < right) {
        if (arr[left] != arr[right]) {
            return false;
        }
        left++;
        right--;

        }
        return true;
    }

    public boolean isPalindrome(String s) {
    char[] charArray = s.toCharArray();
    char[] filtered = new char[s.length()];
        int i = 0;
    
        for (char c : charArray) {
            if(Character.isLetter(c) || Character.isLetterOrDigit(c)){
                filtered[i] = Character.toLowerCase(c);
                i++;
            } 
        }
        
        return checkpalindrome(filtered,i);
    }
}
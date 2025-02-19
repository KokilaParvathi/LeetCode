class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        char[] arr = s.toCharArray();
        int left = 0,right = arr.length-1;

        while(left<right){
        
            if(vowels.contains(arr[left]) && vowels.contains(arr[right])){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
            else if(vowels.contains(arr[left])) right--;
            else left++;
        }

    return new String(arr);
    }
}
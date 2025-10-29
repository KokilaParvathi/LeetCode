class Solution {
    public String mergeAlternately(String word1, String word2) {
        String str = "";
        int i = 0, j = 0;

        while(i < word1.length() && j < word2.length()){
                str+=word1.charAt(i++);
                str+=word2.charAt(j++);
            }
        
        if(i < word1.length()) str+=word1.substring(i,word1.length());
        if(j < word2.length()) str+=word2.substring(j,word2.length());

        return str;
    }
}
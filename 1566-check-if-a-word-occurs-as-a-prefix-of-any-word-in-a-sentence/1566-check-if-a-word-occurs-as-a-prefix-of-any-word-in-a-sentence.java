class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
    String[] str = sentence.split("\\s+");

    for(int i = 0; i < str.length; i++){
    if(str[i].startsWith(searchWord)) return i+1;
    else continue;
    }

    return -1;  
    }
}
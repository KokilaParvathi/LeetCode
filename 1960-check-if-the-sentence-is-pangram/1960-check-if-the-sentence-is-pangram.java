class Solution {
    public boolean checkIfPangram(String sentence) {
    HashSet<Character> hm = new HashSet<>();
    char[] arr = sentence.toCharArray();

    if(arr.length < 26) return false;

    for(char c:arr){
        hm.add(c);
    }

    return hm.size() == 26;
    }
}
class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int max_vowel = 0, max_con = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for (Character key : map.keySet()){
            if(key == 'a' || key == 'i' || key == 'o' || key == 'e' || key == 'u')
                max_vowel = map.get(key) > max_vowel ? map.get(key) : max_vowel;
            else
                 max_con = map.get(key) > max_con ? map.get(key) : max_con;
        }
        
        return max_vowel + max_con;
    }
}
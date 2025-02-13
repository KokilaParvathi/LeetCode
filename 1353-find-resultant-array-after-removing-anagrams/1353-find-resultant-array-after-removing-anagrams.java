import java.util.*;

class Solution {
    public boolean check(String a, String b) {
        if (a.length() != b.length()) return false;

        char[] arr1 = a.toCharArray();
        Arrays.sort(arr1);
        char[] arr2 = b.toCharArray();
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        res.add(words[0]); 
        
        for (int i = 1; i < words.length; i++) {
            if (!check(words[i], words[i - 1])) { 
                res.add(words[i]);
            }
        }

        return res;
    }
}

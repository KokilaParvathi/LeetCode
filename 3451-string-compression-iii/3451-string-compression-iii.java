import java.util.HashMap;

class Solution {
    public String compressedString(String word) {
        StringBuilder str = new StringBuilder();
        
        int count = 1; 

        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);

            if (i < word.length() - 1 && word.charAt(i) == word.charAt(i + 1)) {
                count++;
            } else {

                while (count > 9) {
                    str.append("9").append(current);
                    count -= 9;
                }
                str.append(count).append(current);

                count = 1;
            }
        }

        return str.toString();
    }
}

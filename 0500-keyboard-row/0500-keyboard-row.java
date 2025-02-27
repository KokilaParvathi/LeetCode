class Solution {
    public String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        for(String word : words) {
            int r1 = 0,r2 = 0,r3 = 0;

            for(char i : word.toLowerCase().toCharArray()) {
                String st = String.valueOf(i);
                if(row1.contains(st)) {
                    r1++;
                } else if(row2.contains(st)) {
                    r2++;
                } else {
                    r3++;
                }
            }
            if(r1 == word.length() || r2 == word.length() || r3 == word.length()) {
                list.add(word);
            }
        }
        
        return list.toArray(new String[0]);
    }
}
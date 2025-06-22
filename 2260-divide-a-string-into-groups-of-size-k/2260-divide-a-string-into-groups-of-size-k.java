class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            StringBuilder str = new StringBuilder();

            for (int j = 0; j < k; j++) {
                if (i  < s.length()) {
                    str.append(s.charAt(i));
                    i++;
                } else {
                    str.append(fill);
                }
            }
            i--;

            result.add(str.toString());
        }

        return result.toArray(new String[0]);
    }
}

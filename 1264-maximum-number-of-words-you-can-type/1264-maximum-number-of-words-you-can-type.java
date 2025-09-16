class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> broken = new HashSet<>();
        int count = 0;

        for (int i = 0; i < brokenLetters.length(); i++) {
            broken.add(brokenLetters.charAt(i));
        }

        String[] tex = text.split(" ");

        for (String word : tex) {
            for (char c : word.toCharArray()) {
                if (broken.contains(c)) {
                    count++;
                    break;
                }
            }
        }

        return tex.length-count;
    }
}
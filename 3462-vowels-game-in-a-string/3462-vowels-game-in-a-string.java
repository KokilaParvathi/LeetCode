class Solution {
    public boolean doesAliceWin(String s) {
        Set<Character> set = new HashSet<>(Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i)))
                return true;
        }

        return false;
    }
}
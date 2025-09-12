class Solution {
    public boolean doesAliceWin(String s) {
        Set<Character> set = new HashSet<>(Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i)))
                list.add(s.charAt(i));
        }

        if (list.size() % 2 == 1)
            return true;
        else if (list.size() == 0)
            return false;
        else
            return true;
    }
}
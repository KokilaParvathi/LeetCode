class Solution {
    public String sortVowels(String s) {
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        List<Character> arr = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i)))
                arr.add(s.charAt(i));
        }

        Collections.sort(arr);
        j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(s.charAt(i)))
                str.append(s.charAt(i));
            else {
                str.append(arr.get(j++));
            }

        }

        return str.toString();
    }
}
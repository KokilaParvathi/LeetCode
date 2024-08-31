bool isAnagram(char* s, char* t) {
    int n1 = strlen(s);
    int n2 = strlen(t);

    if (n1 != n2) {
        return false;
    }

    int freq[26] = {0}; 

    for (int i = 0; i < n1; i++) {
        freq[s[i] - 'a']++;
        freq[t[i] - 'a']--;
    }

    for (int i = 0; i < 26; i++) {
        if (freq[i] != 0) {
            return false;
        }
    }

    return true;
}

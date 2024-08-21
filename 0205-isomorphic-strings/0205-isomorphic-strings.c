bool isIsomorphic(char* s, char* t) {
    short len1=strlen(s);
    short len2=strlen(t);
    short c=1;
    if (len1 != len2) {
        return false;  
    }

   for (int i = 0; i < len1; i++) {
        for (int j = i + 1; j < len2; j++) {
            if (s[i] == s[j]) {
                if (t[i] != t[j]) {
                    c = 0;
                    break;
                }
            } else if (t[i] == t[j]) {
                c = 0;  
                break;
            }
        }
        if (c == 0) {
            break;
        }
    }
    
    if (c == 1) {
        return true;
    } else {
        return false;
    }
}

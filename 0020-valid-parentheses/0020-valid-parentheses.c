bool isValid(char* s) {
    int len = strlen(s);
    if (len % 2 != 0) return false;

    for (int i = 0; i < len; i++) {
        if ((s[i] == '{' && s[i+1] == '}') || 
            (s[i] == '[' && s[i+1] == ']') || 
            (s[i] == '(' && s[i+1] == ')')) {
            memmove(&s[i], &s[i + 2], len - i - 1);
            s[len - 2] = '\0';
            len -= 2;
            i = -1; 
        }
    }

   
    return len == 0;
}

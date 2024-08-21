int lengthOfLastWord(char* s) {
    int len=strlen(s);
    int c=0;
    for(int i=len;i>=0;i--){
        if(isalpha(s[i])){
            c++;
        }
        else if(c>=1&&s[i]==' ')
        break;
    }
    return c;
}
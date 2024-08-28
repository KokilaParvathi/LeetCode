char findTheDifference(char* s, char* t) {
    for(int i=0;s[i]!='\0';i++){
        for(int j=0;t[j]!='\0';j++){
            if(s[i]==t[j]){
            t[j]='*';
            break;
            }
        }
    }
    for(int i=0;t[i]!='\0';i++){
        if(isalpha(t[i])){
        return t[i];
        }
    }
    return 0;

}
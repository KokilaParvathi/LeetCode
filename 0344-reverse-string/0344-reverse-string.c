void reverseString(char* s, int sSize) {
    int left = 0,right = sSize-1;

    while(left < right){
        char tem = s[left];
        s[left] = s[right];
        s[right] = tem;
        left++;
        right--;
    }
    
}
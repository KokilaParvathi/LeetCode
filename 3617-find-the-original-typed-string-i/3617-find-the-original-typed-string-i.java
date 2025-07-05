class Solution {
    public int possibleStringCount(String word) {
        int value = 1,count = 1;
        for(int i = 1; i < word.length(); i++){
            if(word.charAt(i) ==  word.charAt(i-1)) count++;
            else{
                if(count > 1) value+= (count-1);
                count = 1;
            }
        }

        if (count > 1) value += (count-1);

        return value;
    }
}
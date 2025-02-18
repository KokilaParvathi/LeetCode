class Solution {
    public boolean judgeCircle(String moves) {
    int countup = 0, countleft = 0;

    for(int i = 0; i < moves.length(); i++){
        char chr = moves.charAt(i);

        if(chr == 'U') countup++;
        else if(chr == 'D') countup--;
        else if(chr == 'L') countleft++;
        else countleft--;
        
    }

    return countup == 0 && countleft == 0;
    }
}
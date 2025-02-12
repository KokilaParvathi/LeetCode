class Solution {
    public int mostWordsFound(String[] sentence) {
    int maxwordcount = 0,count=0;

    for(String str:sentence){
    count = str.trim().isEmpty() ? 0 : str.trim().split("\\s+").length;
    Math.max(maxwordcount,count);
    }
    return maxwordcount > count?maxwordcount:count;
    }
}
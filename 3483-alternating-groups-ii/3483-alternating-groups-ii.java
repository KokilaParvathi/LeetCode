class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int ans = 0;
        int lastele = colors[0];
        int continuesseq = 0;
        for(int i = 1;i<colors.length+k;i++){
            int index = i%colors.length;
            if(lastele == colors[index]){
                continuesseq=1;
                lastele = colors[index];
                continue;
            }
            continuesseq++;
            if(continuesseq>=k){
                ans++;
            }
            lastele = colors[index];
        }
        return ans;
    }
}

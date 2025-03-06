class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE,maxprofit = 0;

        for(int num:prices){
            buy = Math.min(buy,num);
            maxprofit = Math.max(maxprofit, num - buy); 
        }   

        return maxprofit;
    }
}
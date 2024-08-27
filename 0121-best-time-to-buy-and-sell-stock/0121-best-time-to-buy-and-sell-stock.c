int maxProfit(int* prices, int pricesSize) {
    if (pricesSize == 0) return 0; 

    int min_buy = prices[0];
    int max_profit = 0;

    for (int i = 1; i < pricesSize; i++) {
        if (prices[i] < min_buy) {
            min_buy = prices[i]; 
        } else if (prices[i] - min_buy > max_profit) {
            max_profit = prices[i] - min_buy; 
        }
    }
    
    return max_profit;
}

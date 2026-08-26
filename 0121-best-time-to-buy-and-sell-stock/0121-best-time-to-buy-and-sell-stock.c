int maxProfit(int* prices, int pricesSize) {
    int minprice = prices[0];
    int max = 0;
    for(int i = 1; i < pricesSize; i++){
        int profit = prices[i] - minprice;
        if(profit > max){
            max = profit;
        }
        if(prices[i] < minprice){
            minprice = prices[i];
        }
    }
    return max;
}
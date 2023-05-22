public class StockBuyAndSell {
    public int maxProfit(int[] prices) {
        int minBuy = prices[0];
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            int cost = prices[i] - minBuy;
            if (cost > maxProfit) {
                maxProfit = cost;
            }
            if (prices[i] < minBuy) {
                minBuy = prices[i];
            }
        }
        return maxProfit;
    }
}

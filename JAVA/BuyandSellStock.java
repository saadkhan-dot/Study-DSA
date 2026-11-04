public class BuySellStock {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - minPrice;

            maxProfit = Math.max(maxProfit, profit);
            minPrice = Math.min(minPrice, prices[i]);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        BestTimeToBuySellStock solution = new BestTimeToBuySellStock();

        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println(solution.maxProfit(prices)); // Output: 5
    }
}
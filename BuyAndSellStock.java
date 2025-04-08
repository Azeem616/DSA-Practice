//You are given an array prices where prices[i] is the price of a stock on the i-th day.
//
//Your goal is to maximize your profit by choosing one day to buy and one day to sell the stock later.
//
//👉 Return the maximum profit you can achieve from this transaction.
//If you can’t make a profit, return 0.

//You get an array of prices like:
//[7, 1, 5, 3, 6, 4]
//Each number = stock price on that day (index = day number).
//You’re allowed to buy once and sell once after that.
//Your goal = max profit.




public class BuyAndSellStock{

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0)
            return 0;

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int currentPrice = prices[i];

            if (currentPrice < minPrice) {
                minPrice = currentPrice;
            }

            int profit = currentPrice - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

            return maxProfit;
        }
        public static void main(String args[]) {
            int[] prices = {7, 1, 5, 3, 6, 4};
            int result = maxProfit(prices);
            System.out.println("Maximum profit: " + result);
        }
    }


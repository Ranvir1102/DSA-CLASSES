/**Question 3: Best Time to Buy and Sell Stock 
 
 
You are given an array prices where prices[i] is the price of a given stock on the i-th day. 
Return the maximum profit you can achieve from one transaction. 
If no profit can be made, return 0. 
Examples 
Example 1 
Input: prices = [7,1,5,3,6,4] 
Output: 5 
Explanation: 
Buy on day 2 (price = 1) and sell on day 5 (price = 6). 
Example 2 
Input: prices = [7,6,4,3,1] 
Output: 0  */

package DSAQ;
public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            // Update minimum buying price
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            // Calculate profit if sold today
            int profit = prices[i] - minPrice;

            // Update maximum profit
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices1)); // 5

        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(prices2)); // 0
    }
}

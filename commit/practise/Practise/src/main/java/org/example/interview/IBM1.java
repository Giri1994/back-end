package org.example.interview;


//        You are given an array prices where prices[i] is the price of a given stock on the ith day.
//        You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//        Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
//
//        Example 1:
//        Input: prices = [7,1,5,3,6,4]
//        Output: 5
//        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
//        Example 2:
//        Input: prices = [7,6,4,3,1]
//        Output: 0
//        Explanation: In this case, no transactions are done and the max profit = 0.
public class IBM1 {

    public int maxProfit(int[] prices) {

        if (prices.length < 2 || prices == null)
            return 0;

        int minPrice = prices[0];
        int maxPrice = 0;

        for(int i=0 ;i<prices.length;i++){
            int pontentialProfit = prices[i] - minPrice;

            maxPrice = Math.max(pontentialProfit,maxPrice);
            minPrice = Math.min(minPrice,prices[i]);
        }

        return  maxPrice;
    }

    public static void main(String args[]) {
        int[] prices1 = {7, 1, 5, 3, 6, 4};

        int[] prices2 = {7, 6, 4, 3, 1};
        IBM1 ibm1 = new IBM1();

        int res1 = ibm1.maxProfit(prices1);
        System.out.println(res1);

        int res2 = ibm1.maxProfit(prices2);
        System.out.println(res2);
    }


}

//
//
//    Example Walkthrough:
//        Example 1: prices = [7, 1, 5, 3, 6, 4]
//        Initialization:
//
//        minPrice = 7 (the first price).
//        maxProfit = 0 (no profit yet).
//        Iterate through the prices:
//
//        Day 1 (Price = 1):
//
//        Potential profit = 1 - 7 = -6 (no profit, so maxProfit remains 0).
//        Update minPrice to 1 (since 1 is the new lowest price).
//        Day 2 (Price = 5):
//
//        Potential profit = 5 - 1 = 4 (profit of 4, so maxProfit becomes 4).
//        minPrice stays 1 (no change).
//        Day 3 (Price = 3):
//
//        Potential profit = 3 - 1 = 2 (no update to maxProfit, which is 4).
//        minPrice stays 1.
//        Day 4 (Price = 6):
//
//        Potential profit = 6 - 1 = 5 (profit of 5, so maxProfit becomes 5).
//        minPrice stays 1.
//        Day 5 (Price = 4):
//
//        Potential profit = 4 - 1 = 3 (no update to maxProfit).
//        minPrice stays 1.
//        Result: The maximum profit is 5 (buy at 1, sell at 6).
//
//        Example 2: prices = [7, 6, 4, 3, 1]
//        Initialization:
//
//        minPrice = 7, maxProfit = 0.
//        Iterate through the prices:
//
//        Prices are always decreasing, so maxProfit remains 0 throughout the loop.
//        Result: The maximum profit is 0 (no transaction is done).



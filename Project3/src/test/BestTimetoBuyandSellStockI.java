package test;


public class BestTimetoBuyandSellStockI {

    private static void maxProfit(int[] prices) {

        int buyPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int currentProfit = prices[i] - buyPrice;

            if (currentProfit > maxProfit)
                maxProfit = currentProfit;

            if( prices[i] < buyPrice )
                buyPrice = prices[i];
        }

        System.out.println(maxProfit);
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        maxProfit(prices);
    }


}

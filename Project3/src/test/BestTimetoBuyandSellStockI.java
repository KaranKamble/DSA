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

    private static int maxProfitV2(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        maxProfitV2(prices);
    }


}

package test;

public class BestTimetoBuyandSellStockII {

    private static void maxProfit(int[] prices) {
            int maxProfit=0;

        for (int i = 0; i < prices.length-1; i++) {
            if( prices[i] < prices[i+1])
                maxProfit += prices[i+1] - prices[i];
        }

        System.out.println(maxProfit);
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        maxProfit(prices);
    }


}

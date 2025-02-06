package D_Arrays;

public class Q23_buySellStockI {
//  SOLVED ON LEETCODE
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else {
                if (prices[i] - buy > profit) {
                    profit = prices[i] - buy;
                }
            }
        }

        return profit;

        // brute force

       /* int[] arr = new int[prices.length];
        int p1 = 0;
        int p2 = 0;
        for(int i = 0; i<prices.length; i++){
        int max = prices[i];
        for(int j = i; j<prices.length; j++){
        if(prices[j] > max){
        max = prices[j];
        arr[i] = max;
        }
        arr[i] = max;
        }
        }

        int profit = arr[0] - prices[0];
        for(int i = 1; i<prices.length; i++){
        if(arr[i] - prices[i] > profit){
        profit = arr[i] - prices[i];
        }
        }

        return profit; 
        */
    }
}

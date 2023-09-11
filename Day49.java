//Best time to buy and sell stocks to get max profit

class Solution {
    public int maxProfit(int[] prices) {
         int buyPrices=Integer.MAX_VALUE;
        int maxProfit=0;
        for (int i = 0; i < prices.length; i++) {
            if(buyPrices<prices[i]){//profit
                int profit=prices[i]-buyPrices;//today's profit
                maxProfit=Math.max(maxProfit,profit);
            }else{
                buyPrices=prices[i];
            }

        }return maxProfit;
    }
}

        
    

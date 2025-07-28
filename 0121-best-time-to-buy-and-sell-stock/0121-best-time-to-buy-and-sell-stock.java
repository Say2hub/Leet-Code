class Solution {
    public int maxProfit(int[] prices) {
        // First we will determine min_price to start buying, then compare with profits gained.
        int min_price = Integer.MAX_VALUE;
        int max_profit = 0;
        for(int price:prices){
            if(price<min_price){
                min_price = price;
            }
            else{
                int profit = price-min_price;
                if(profit>max_profit){
                    max_profit=profit;
                }

            }
        } 
    return max_profit; 
    }
}
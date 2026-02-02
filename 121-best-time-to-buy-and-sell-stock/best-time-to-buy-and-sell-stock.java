class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int index = 0;

        for(int i=1;i<prices.length;i++){
            if(prices[index]>prices[i]){
                index = i;
            }

            res = Math.max(res,prices[i]-prices[index]);
        }
        return res;
    }
}
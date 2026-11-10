class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        // int i=0;
        int j = prices.length - 1;
        int maxPro = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        if(n==1){
            return 0;
        }
        if(n==2){
            return prices[0]<prices[1] ? (prices[1]-prices[0]):0;
        }
        for(int i=0;i<n;i++){
            min=Math.min(min,prices[i]);
            maxPro=Math.max(maxPro,(prices[i]-min));
        }


        return maxPro;
    }
}
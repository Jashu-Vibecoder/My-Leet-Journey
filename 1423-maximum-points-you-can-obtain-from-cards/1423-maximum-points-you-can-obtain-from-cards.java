class Solution {
    public int maxScore(int[] cardPoints, int k) {
        if (cardPoints.length == k) {
            int maxsum = 0;
            for (int i : cardPoints) {
                maxsum += i;
            }
            return maxsum;
        }
        int msum = 0;
        int tsum = 0;
        for (int i : cardPoints) {
            tsum += i;
        }

        for(int i=0;i<=k;i++){
            int csum=0;
            for(int j=i;j<i+(cardPoints.length-k);j++){
                csum+=cardPoints[j]; 
            }
            msum=Math.max(msum,(tsum-csum));
        }


        return msum;
    }
}
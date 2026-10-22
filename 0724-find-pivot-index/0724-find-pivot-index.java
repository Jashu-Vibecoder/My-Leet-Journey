class Solution {
    public int pivotIndex(int[] nums) {

        int tsum = 0;
        int rsum = 0, lsum = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            tsum += nums[i];
        }

        for (int i = 0; i < n ; i++) {
            rsum = tsum - lsum - nums[i];

            if (lsum == rsum) {
                return i;
            }
            lsum += nums[i];

        }

        return -1;
    }
}
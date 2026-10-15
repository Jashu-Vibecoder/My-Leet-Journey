class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int r=nums.length-1;

        while(nums[l]>nums[r]){
            l++;
        }

    return nums[l];
    }
}
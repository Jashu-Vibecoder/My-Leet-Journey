class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int sq=nums[i]*nums[i];
            int temp=nums[i];
            nums[i]=sq;
            sq=temp; 
            
        }
        Arrays.sort(nums);
    return nums; 
    }
}
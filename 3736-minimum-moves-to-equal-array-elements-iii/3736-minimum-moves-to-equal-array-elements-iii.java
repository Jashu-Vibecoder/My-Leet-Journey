class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        // Arrays.sort(nums);
        
        int max=0;
        for(int i:nums){
            if(i>max){
                max=i;
            }
        }
        int moves=0;
        for(int i=0;i<n;i++){
            moves+=(max-nums[i]);
        }
    return moves;
    }
}
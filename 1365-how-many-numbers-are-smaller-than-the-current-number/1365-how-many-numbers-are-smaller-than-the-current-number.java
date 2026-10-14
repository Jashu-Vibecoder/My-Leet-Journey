class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int l=nums.length;
        int[] arr=new int[l];

        for(int i=0;i<l;i++){
            int count=0;
            for(int j=0;j<l;j++){
                
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            arr[i]=count;
        }


    return arr;
    }
}
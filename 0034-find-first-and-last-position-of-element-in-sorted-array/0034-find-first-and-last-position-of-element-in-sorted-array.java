class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] wrong={-1,-1};
        int[] arr ={-1,-1};
        if(nums.length==0){
            return arr;
        }
        if(nums.length==1){
            if(nums[0]==target){
                arr[0]=0;
                arr[1]=0;
                return arr;
            }else if(nums[0]!=target){
                return arr;
            }
        }
        int l=0;
        int r=nums.length-1;
        
        
        while(l<=r){           
            int mid=l+((r-l)/2);
            if(nums[mid]==target){
                arr[0]=mid;
                r=mid-1;
            }else if(nums[mid]>target){
                r=mid-1;
            }else if(nums[mid]<target){
                l=mid+1;
            }
        }
        l=0;
        r=nums.length-1;
         while(l<=r){           
            int mid=l+((r-l)/2);
            if(nums[mid]==target){
                arr[1]=mid;
                l=mid+1;
            }else if(nums[mid]>target){
                r=mid-1;
            }else if(nums[mid]<target){
                l=mid+1;
            }
        }
    return arr;
    }
}
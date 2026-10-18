class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int[] ans=new int[2];

        for (int i = 0; i < n; i++) {

            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        int count=0;
        for(int key:map.keySet()){
            if(map.get(key)==1){
                ans[count]=key;
                count++;
            }

        }
        return ans;
    }
}
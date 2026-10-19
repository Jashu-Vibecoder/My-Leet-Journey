class Solution {
    public int repeatedNTimes(int[] nums) {
        int len = nums.length;
        int n = len / 2;
        int ans = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
    
        for (int i = 0; i < len; i++) {

            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for(int key:map.keySet()){
            if(map.get(key)==n){
                ans=key;
            }
        }

        return ans;
    }
}
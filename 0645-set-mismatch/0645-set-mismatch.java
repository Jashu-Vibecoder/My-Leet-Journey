class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for(int key : map.keySet()){
            if(map.get(key)>1){
                arr[0]=key;
                break;
            }
        }
        for(int i=0;i<=n;i++){
            if(!map.containsKey(i)){
                arr[1]=i;
            }
        }
        return arr;
    }
}
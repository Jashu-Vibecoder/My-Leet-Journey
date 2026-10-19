class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        System.gc();
        int n = nums.length;
        // Arrays.sort(nums);

        HashMap<Integer, Integer> map = new HashMap<>();
        

        for (int i = 0; i < n; i++) {

            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        PriorityQueue<Integer> pq =new PriorityQueue<>((a, b) -> Integer.compare(map.get(b), map.get(a)));
        for (int key : map.keySet()) {
            pq.offer(key);

        }

        int[] arr = new int[k];

        for (int i = 0; i < k; i++) {
            arr[i] = (pq.poll());
        }

        return arr;
    }
}

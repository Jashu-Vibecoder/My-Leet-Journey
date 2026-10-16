class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n3 = nums3.length;
        for (int i = 0; i < n1; i++) {
            if (map1.containsKey(nums1[i])) {
                map1.put(nums1[i], map1.get(nums1[i]) + 1);
            } else {
                map1.put(nums1[i], 1);
            }
        }
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < n2; i++) {
            if (map2.containsKey(nums2[i])) {
                map2.put(nums2[i], map2.get(nums2[i]) + 1);
            } else {
                map2.put(nums2[i], 1);
            }
        }
        HashMap<Integer, Integer> map3 = new HashMap<>();
        for (int i = 0; i < n3; i++) {
            if (map3.containsKey(nums3[i])) {
                map3.put(nums3[i], map3.get(nums3[i]) + 1);
            } else {
                map3.put(nums3[i], 1);
            }
        }

        int ss = Math.min(map1.size(), Math.min(map2.size(), map3.size()));

        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        set.addAll(map1.keySet());
        set.addAll(map2.keySet());
        set.addAll(map3.keySet());

        for (int k : set) {
            int count = 0;
            if (map1.containsKey(k)) {
                count++;
            } 
             if (map2.containsKey(k)) {
                count++;
            } 
             if (map3.containsKey(k)) {
                count++;
            }

            if (count >= 2) {
                list.add(k);
            }
        }

        return list;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int result[] = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        List<Integer>[] buckets = new List[nums.length+1];
        for(int i=0;i<buckets.length;i++) {
            buckets[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> mp:map.entrySet()) {
            int number = mp.getKey();
            int freq = mp.getValue();
            buckets[freq].add(number);
        }

        for (int i=buckets.length - 1;i>=0&&count<k;i--) {
            for (int num : buckets[i]) {
                result[count++] = num;
                if (count == k) break;
            }
        }

     return result;
    }
}
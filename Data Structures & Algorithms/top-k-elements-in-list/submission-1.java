class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> freqMap = new HashMap<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>(
           (a,b) -> -1 * (freqMap.get(a) - freqMap.get(b))
        );

        for(int i : nums){
            freqMap.put(i, freqMap.getOrDefault(i,0)+1);               
        }

        for(int i : freqMap.keySet()){
            queue.add(i);
        }

        
        
        int[] result = new int[k];

        for(int i = 0 ; i< k; i++){
            result[i] = queue.poll();
        }

        return result;

    }
}

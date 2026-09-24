class Solution {
    public int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> mem = new HashMap<>();
        
        int prefixSum = 0;
        int count = 0;
        for(int i=0; i< nums.length; i++){
            prefixSum += nums[i];

            if(prefixSum == k){
                count++;
            }
           
            int rem = prefixSum - k;
            if(mem.containsKey(rem)){
                count+=mem.get(rem);
            }
                     

            mem.put(prefixSum, mem.getOrDefault(prefixSum, 0) + 1);
        }


        return count;


    }
}
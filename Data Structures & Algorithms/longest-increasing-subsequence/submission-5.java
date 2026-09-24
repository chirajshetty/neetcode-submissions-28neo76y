class Solution {
    private Map<Integer,Integer> mem = new HashMap<>();

    public int lengthOfLIS(int[] nums) {
        int max = 0;
        for(int i = 0; i<nums.length; i++){
            max = Math.max(max, subseq(i, nums));
        }
        return max;
    }

    private int subseq(int index, int[] nums){
        if(mem.containsKey(index)){
            return mem.get(index); 
        }

        int max = 1;
        for(int j=index+1 ; j<nums.length; j++){
            if(nums[j] > nums[index]){
                max = Math.max(max, subseq(j, nums) + 1);
            }
        }

        mem.put(index, max);
        return max;
    }
}

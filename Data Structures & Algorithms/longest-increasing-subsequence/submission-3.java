class Solution {
    private Map<Integer,Integer> mem = new HashMap<>();

    public int lengthOfLIS(int[] nums) {
        int max = 0;
        for(int i = 0; i<nums.length; i++){
            int depth = 1; 
            if(mem.containsKey(i)){
                depth += mem.get(i);
            }else{
                int sub = subseq(i, nums);
                depth += sub;
                mem.put(i, sub);
            }

            max = Math.max(max,depth);
        }
        return max;
    }

    private int subseq(int index, int[] nums){
        int max = 0;
        for(int j=index+1 ; j<nums.length; j++){
            if(nums[j] > nums[index]){
                int depth = 1; 
                if(mem.containsKey(j)){
                    depth += mem.get(j);
                }else{
                    int sub = subseq(j, nums);
                    depth += sub ;
                    mem.put(j, sub);
                }

                max = Math.max(max, depth);
            }
        }
        return max;
    }
}

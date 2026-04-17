class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> sets = new HashSet<>();

        for(int i : nums){
            sets.add(i);
        }

        List<Integer> candidates = new ArrayList<>();
        for(int i : nums){
            if(sets.contains(i-1)){
                continue;
            } else {
                candidates.add(i);
            }
        }
        
        int result = 0;
        for(int i : candidates){
            int max = 0;
            while(sets.contains(i)){
                max++;
                i++;
            }

            if(max > result) result = max;
        }

        return result;


    }
}

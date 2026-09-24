class Solution {
    public int rob(int[] nums) {
        int next = 0;
        int next1 = 0; 
        int current = 0;

        for(int i = nums.length - 1; i>= 0; i-- ){
            System.out.println(current + " " + next + " " + next1 );
            current = Math.max(nums[i] + next1, next);
            next1 = next;
            next = current;
        }

        return current;
    }
}

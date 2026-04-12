class Solution {

    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

        for(int i=0 ; i<res.length ; i++){
            res[i] = prefix(nums, i) * sufix(nums, i);
        }
       
        return res;
    }

    private int prefix(int[] nums, int index){
        int prod = 1;
        while (index > 0){
            prod *= nums[--index];
        }
        return prod;
    }
    
    private int sufix(int[] nums, int index){
        int prod = 1;
        while (index < nums.length - 1){
            prod *= nums[++index];
        }
        return prod;
    }
}  

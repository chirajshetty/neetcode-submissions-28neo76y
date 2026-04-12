class Solution {
    private Map<Integer, Integer> precache; 
    private Map<Integer, Integer> sucache;

    public int[] productExceptSelf(int[] nums) {
        precache = new HashMap<>();
        sucache = new HashMap<>();   

        int[] res = new int[nums.length];
        for(int i=0 ; i<res.length ; i++){
            int p = (i==0) ? 1 : prefix(nums, i-1);
            int s = (i == res.length - 1)? 1 : sufix(nums, i+1);

            // System.out.println(p + " " + s);
            // System.out.println(precache + " " + sucache);
            res[i] =  p*s ;
        }
        return res;
    }

    private int prefix(int[] nums, int index){
        int prod = 1;

        if(precache.containsKey(Integer.valueOf(index))){
            return precache.get(index);
        }

        if (index >= 0){
            prod *= nums[index] * prefix(nums, --index);
        }

        precache.put(index+1, prod);
        return prod;
    }
    
    private int sufix(int[] nums, int index){
        int prod = 1;

        if(sucache.containsKey(Integer.valueOf(index))){
            return sucache.get(index);
        }

        if (index < nums.length){
            prod *= nums[index] * sufix(nums, ++index);
        }

        sucache.put(index-1, prod);
        return prod;
    }
}  

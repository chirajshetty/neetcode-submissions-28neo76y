class Solution {

    HashMap<Integer, Integer> map = new HashMap<>();
    public int climbStairs(int n) {

        if(n<=2){
            return n;
        }
        
        int result = 0;
        if(map.containsKey(n)){
            result = map.get(n);
        }
        else{
            result = climbStairs(n-1) + climbStairs(n-2);
        }
        map.put(n, result);
        return result;
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> maps = new HashMap<>();

        for(String str : strs){
            char[] keyarr = str.toCharArray();
            Arrays.sort(keyarr);
            String key = new String(keyarr);

            maps.putIfAbsent(key,new ArrayList<>());
            maps.get(key).add(str);
        }

        return new ArrayList<>(maps.values());
    }
}

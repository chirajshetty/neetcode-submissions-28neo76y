class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, ArrayList<String>> maps = new HashMap<>();

        for(String str : strs){
            char[] keyarr = str.toCharArray();
            Arrays.sort(keyarr);
            String key = new String(keyarr);

            maps.putIfAbsent(key,new ArrayList<>());
            maps.get(key).add(str);
        }

        for(String key : maps.keySet()){
            result.add(maps.get(key));
        }

        return result;
    }
}

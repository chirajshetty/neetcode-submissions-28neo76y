class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, ArrayList<String>> maps = new HashMap<>();

        for(String str : strs){
            char[] keyarr = str.toCharArray();
            Arrays.sort(keyarr);
            String key = new String(keyarr);

            if(maps.containsKey(key)){
                ArrayList<String> vlist = maps.get(key);
                vlist.add(str);
                maps.put(key, vlist); 
            }else{
                ArrayList<String> vlist = new ArrayList<>();
                vlist.add(str);
                maps.put(key, vlist); 
            }
        }

        for(String key : maps.keySet()){
            result.add(maps.get(key));
        }

        return result;
    }
}

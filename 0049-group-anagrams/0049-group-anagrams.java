class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> mp = new HashMap<>();
        for(int i = 0; i<strs.length ; i++){
            String s = strs[i];
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(!mp.containsKey(key)){
                mp.put(key,new ArrayList<>());
            }
            mp.get(key).add(s);
        }
        List<List<String>> res = new ArrayList<>();
        for(Map.Entry<String,List<String>> e : mp.entrySet()){
            res.add(e.getValue());
        }
        return res;
    }
}
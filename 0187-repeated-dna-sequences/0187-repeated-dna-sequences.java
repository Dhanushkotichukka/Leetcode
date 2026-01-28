class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if(s.length() < 10) return new ArrayList<>();
        HashMap<String , Integer> mp = new HashMap<>();
        for(int i=0;i<=s.length()-10;i++){
            String st = s.substring(i,i+10);
            mp.put(st,mp.getOrDefault(st,0)+1);
        }
        ArrayList<String> res = new ArrayList<>();
        for(Map.Entry<String,Integer> hmap : mp.entrySet()){
            if(hmap.getValue() > 1){
                res.add( hmap.getKey());
            }
        }
        return res;
    }
}
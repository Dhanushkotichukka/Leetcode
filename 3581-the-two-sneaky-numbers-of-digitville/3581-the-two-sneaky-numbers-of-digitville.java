class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i:nums) mp.put(i,mp.getOrDefault(i,0)+1);
        ArrayList<Integer> arr = new ArrayList<>();
        for(Integer i: mp.keySet()){
            if(mp.get(i)>1) arr.add(i);
        }
        int res[] = new int[arr.size()];
        for(int i=0;i<arr.size();i++) res[i] = arr.get(i);
        return res;
    }
}
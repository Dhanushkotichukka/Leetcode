class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int max = 0;
        for(int i:nums){
            if(mp.get(i)>max) max = mp.get(i);
        }
        int sum = 0;
        for(int i: mp.values()){
            if(i == max) sum+=i;
        }
        return sum;
    }
}
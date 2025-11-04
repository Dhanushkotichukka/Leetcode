class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int sum = 0;
        for(int i: nums){
            if(mp.get(i)%k==0){
                sum+=i;
            }
        }
        return sum;
    }
}
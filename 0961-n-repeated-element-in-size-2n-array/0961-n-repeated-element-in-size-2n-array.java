class Solution {
    public int repeatedNTimes(int[] nums) {
        int val = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            if(mp.get(nums[i]) == nums.length/2) val = nums[i];
        }
        return val;
    }
}
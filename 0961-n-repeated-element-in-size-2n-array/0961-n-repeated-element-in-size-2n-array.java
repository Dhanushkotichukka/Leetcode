class Solution {
    public int repeatedNTimes(int[] nums) {
        int val = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i: nums){
            if(!set.add(i)){
                return i;
            }
        }
        return nums[nums.length-1];
    }
}
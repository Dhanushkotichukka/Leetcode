class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int mis = 1;
        while(set.contains(mis)){
            mis++;
        }
        return mis;
    }
}
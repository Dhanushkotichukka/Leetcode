class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(sum < 0) sum = 0;
            sum+=nums[i];
            if(sum > ans) ans = sum;
        }
        return ans;
    }
}
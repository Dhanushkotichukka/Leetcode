class Solution {
    public int countPartitions(int[] nums) {
        int c = 0;
        int f = 0;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int i=0;i<nums.length-1;i++){
            sum-=nums[i];
            f += nums[i];
            if(Math.abs(sum-f)%2==0) c++;
        }
        return c;
    }
}
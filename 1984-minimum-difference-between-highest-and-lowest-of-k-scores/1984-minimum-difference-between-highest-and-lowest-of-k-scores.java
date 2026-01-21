class Solution {
    public int minimumDifference(int[] nums, int k) {
        int max = 0;
        int min = 0;
        int ans = Integer.MAX_VALUE;
        Arrays.sort(nums);
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i=0;i<k;i++){
            lst.add(nums[i]);
        }
        for(int i=k;i<nums.length;i++){
            max = Collections.max(lst);
            min = Collections.min(lst);
            ans = Math.min(ans,max-min);
            lst.remove(Integer.valueOf(nums[i-k]));
            lst.add(nums[i]);
        }
        max = Collections.max(lst);
        min = Collections.min(lst);
        ans = Math.min(ans,max-min);
        return ans;
    }
}
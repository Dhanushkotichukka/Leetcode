class Solution {
    private List<List<Integer>> res = new ArrayList<>();
    private List<Integer> sub = new ArrayList<>();
    public void solve(int nums[], int ind){
        if(ind == nums.length){
            res.add(new ArrayList(sub));
            return;
        }
        sub.add(nums[ind]);
        solve(nums,ind+1);
        sub.remove(sub.size()-1);
        solve(nums,ind+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        solve(nums,0);
        return res;
    }
}
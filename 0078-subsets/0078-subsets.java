class Solution {
    private List<List<Integer>> lst = new ArrayList<>();
    private List<Integer> s = new ArrayList<>();
    public void sol(int[] nums,int ind){
        if(ind == nums.length){
            lst.add(new ArrayList(s));
            return;
        }
        s.add(nums[ind]);
        sol(nums,ind+1);
        s.removeLast();
        sol(nums,ind+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
       
        sol(nums,0);
        return lst;
        
    }
}
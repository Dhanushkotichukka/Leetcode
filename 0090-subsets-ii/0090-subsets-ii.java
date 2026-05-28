class Solution {
    private List<List<Integer>> lst = new ArrayList<>();
    private List<Integer> sub = new ArrayList<>();
    public void sol(int ind,int nums[]){
        lst.add(new ArrayList(sub));
        for(int i=ind;i<nums.length;i++){
            if(i>ind && nums[i] == nums[i-1]){
                continue;
            }
            sub.add(nums[i]);
            sol(i+1,nums);
            sub.removeLast();
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         Arrays.sort(nums);
         sol(0,nums);
         return lst;
    }
}
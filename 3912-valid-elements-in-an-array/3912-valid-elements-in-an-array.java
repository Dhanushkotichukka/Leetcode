class Solution {
    public List<Integer> findValidElements(int[] nums) {
        List<Integer> ll = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int l = 0;
            int r = 0;
            if(i==0) ll.add(nums[0]);
            else if(i==nums.length-1) ll.add(nums[nums.length-1]);
            else {
                for(int j=0;j<nums.length;j++){
                    if(i>j && nums[j] < nums[i]) l++;
                    if(i<j && nums[j] < nums[i]) r++;
                }
                if(l == i || r==(nums.length)-i-1) ll.add(nums[i]);
            }
        }
        return ll;
    }
}
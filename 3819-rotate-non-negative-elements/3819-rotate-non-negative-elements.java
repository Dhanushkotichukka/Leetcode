class Solution {
    public int[] rotateElements(int[] nums, int k) {
        ArrayList<Integer> lst = new ArrayList<>();
        for(int x: nums){
            if(x>=0) lst.add(x);
        }
        int m = lst.size();
        if(m == 0) return nums;
        k = k%m;
        Collections.rotate(lst,-k);
        int ind = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                nums[i] = lst.get(ind++);
            }
        }
        return nums;
    }
}
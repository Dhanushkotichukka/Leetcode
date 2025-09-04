class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(freq.get(nums[i])==1){
                a = nums[i];
                break;
            }
        }
        return a;
    }
}
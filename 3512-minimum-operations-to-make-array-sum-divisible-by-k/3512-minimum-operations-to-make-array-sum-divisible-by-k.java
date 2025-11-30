class Solution {
    public int minOperations(int[] nums, int k) {
        int op=0;
        for(int i:nums){
            op+=i;
        }
        return op%k;
    }
}
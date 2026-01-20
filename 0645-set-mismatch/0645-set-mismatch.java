class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        int n = nums.length;
        int sum = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
            sum+=i;
        }
        Arrays.sort(nums);
        for(int key:mp.keySet()){
            if(mp.get(key)==2){
                res[0] = key;
                break;
            }
        }
        int val = n*(n+1)/2;
        sum -= res[0];
        res[1] = val - sum;
        return res;
    }
}
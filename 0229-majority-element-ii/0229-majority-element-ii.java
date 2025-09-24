class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int m = n/3;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(nums[i] , mp.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int key : mp.keySet()){
            if(mp.get(key) > m ) arr.add(key);
        }
        return arr;
    }
}
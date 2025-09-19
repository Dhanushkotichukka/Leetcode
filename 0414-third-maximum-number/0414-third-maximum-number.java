class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i:nums){
            s.add(i);
        }
        Integer[] arr = s.toArray(new Integer[0]);
        Arrays.sort(arr);
        if(s.size()>=3)return arr[arr.length-3];
        return arr[arr.length-1];
    }
}
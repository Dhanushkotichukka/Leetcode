class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer, Integer> sum = new HashMap<>();
        for (int[] nums : nums1) {
            sum.put(nums[0], sum.getOrDefault(nums[0], 0) + nums[1]);
        }
        for (int[] nums : nums2) {
            sum.put(nums[0], sum.getOrDefault(nums[0], 0) + nums[1]);
        }
        TreeMap<Integer, Integer> sortedsum = new TreeMap<>(sum);
        int[][] arr = new int[sum.size()][2];
        int i = 0;
        for (HashMap.Entry<Integer, Integer> entry : sortedsum.entrySet()) {
            arr[i][0] = entry.getKey();
            arr[i][1] = entry.getValue();
            i++;
        }
        // Arrays.sort(arr);
        return arr;
    }
}
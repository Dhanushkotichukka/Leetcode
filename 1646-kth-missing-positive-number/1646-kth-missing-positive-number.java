class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        boolean res[] = new boolean[arr[n-1] + k];
        for (int i : arr) {
            res[i - 1] = true;
        }
        int count = 0;
        for (int i = 0; i < res.length; i++) {
            if (res[i] == false) {
                count++;
            }
            if (count == k) {
                return i + 1;
            }
        }
        return n + k;
    }
}
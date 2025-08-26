class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int max = 0,c=0;
        for(int[] arr:dimensions){
            int val = arr[0]*arr[0]+arr[1]*arr[1];
            if(max < val){
                max = val;
                c = arr[0]*arr[1];
            } else if(max == val) {
                c = Math.max(c, arr[0]*arr[1]);
            }
        }
        return c;
    }
}
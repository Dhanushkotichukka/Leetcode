class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int i = 0, j = 0;
        int c = 1;
        int left = 0, right = n - 1, up = 0, down = n - 1;

        while (c<=n*n) {
            for(j=left;j<=right;j++){
                arr[up][j] = c++;
            }
            up++;
            for(i=up;i<=down;i++ ){
                arr[i][right] = c++;
            }
            right--;
            if(up<=down){
                for(j=right;j>=left;j--){
                    arr[down][j] = c++;
                }
                down--;
            }
            if(left<=right){
                for(j=down;j>=up;j--){
                    arr[j][left] = c++;
                }
                left++;
            }
        }
        return arr;
    }
}
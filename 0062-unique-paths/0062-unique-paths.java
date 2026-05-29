class Solution {
    public int uniquePaths(int m, int n) {
        int mat[][] = new int[m][n];
        mat[0][0] = 1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0) continue;
                int up = 0;
                int left = 0;
                if(i>0) up = mat[i-1][j];
                if(j>0) left = mat[i][j-1];
                mat[i][j] = up+left;
            }
        }
        return mat[m-1][n-1];
    }
}
class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int tot = m*n;
        int [][] res = new int[m][n];
        int c = 0;
        int i = 0,j = 0;
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                c = 0;
                int val = board[i][j];
                
                    if(i-1>=0 && j-1>=0 && board[i-1][j-1]==1) c+=1;
                    if(i-1>=0 && j<n && board[i-1][j]  ==1) c+=1;
                    if(i-1>=0 && j+1<n && board[i-1][j+1]==1) c+=1;
                    if(j-1>=0 && i<m && board[i][j-1]  ==1) c+=1;
                    if(i<m && j+1<n && board[i][j+1]  ==1) c+=1;
                    if(i+1<m && j-1>=0 && board[i+1][j-1] ==1) c+=1;
                    if(i+1<m && j<n && board[i+1][j]   ==1) c+=1;
                    if(i+1<m && j+1<n && board[i+1][j+1] ==1) c+=1;
                if(val == 1){
                    if(c < 2) res[i][j] = 0;
                    else if(c == 2 || c == 3) res[i][j] = 1;
                    else if(c > 3) res[i][j] = 0;
                }else if(val == 0){
                    if(c == 3) res[i][j] = 1;
                }
            }
        }
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                board[i][j] = res[i][j];            
            }
        }
    }
}
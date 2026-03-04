class Solution {
    public int numSpecial(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;
        int c = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){

                if(mat[i][j] == 1){

                    boolean rowCheck = true;
                    boolean colCheck = true;

                    // check row
                    for(int k = 0; k < m; k++){
                        if(k != j && mat[i][k] == 1){
                            rowCheck = false;
                        }
                    }

                    // check column
                    for(int k = 0; k < n; k++){
                        if(k != i && mat[k][j] == 1){
                            colCheck = false;
                        }
                    }

                    if(rowCheck && colCheck){
                        c++;
                    }
                }
            }
        }

        return c;
    }
}
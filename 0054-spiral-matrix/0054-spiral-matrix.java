class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        int r = matrix.length;
        int c = matrix[0].length;
        int front = 0,back = c-1,up = 0,down = r-1;
        int i=front,j;
        while(front<=back && up<=down){
            for(j=front;j<=back;j++){
                res.add(matrix[up][j]);
            }
            up++;
            for(i=up;i<=down;i++){
                res.add(matrix[i][back]);
            }
            back--;
            if(up<=down){
                for(j=back;j>=front;j--){
                res.add(matrix[down][j]);
                }
                down--;
            }
            if(front<=back){
                for(i=down;i>=up;i--){
                    res.add(matrix[i][front]);
                }
                front++;
            }
        }
        return res;
    }
}
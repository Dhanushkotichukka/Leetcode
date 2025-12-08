class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        boolean isup = true;
        int i = 0, j = 0;

        ArrayList<Integer> res = new ArrayList<>();

        while (res.size() < m * n) {
            res.add(mat[i][j]);
            if(isup){
                if(j == n-1){
                    i++;
                    isup = false;
                }else if(i == 0){
                    j++;
                    isup = false;
                }else{
                    i--;
                    j++;
                }
            }else{
                if(i == m-1){
                    j++;
                    isup = true;
                }else if(j == 0){
                    i++;
                    isup = true;
                }else{
                    i++;
                    j--;
                }
            }
        }
        int[] arr = new int[res.size()];
        for (i = 0; i < res.size(); i++) {
            arr[i] = res.get(i);
        }
        return arr;
    }
}

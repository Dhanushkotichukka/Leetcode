class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int ct = 1;
        int tot = 0;
        int m = 0, f = 0;

        int[][] arr = new int[rows * cols][2];

        int i = rStart, j = cStart;

        if (i >= 0 && i < rows && j < cols && j >= 0) {
            arr[m][0] = i;
            arr[m][1] = j;
            m++;
            tot++;
        }
        
        while (tot != rows * cols) {
            if (ct % 2 != 0) {
                f = 0;
                while (f < ct) {
                    j++;
                    if (i >= 0 && i < rows && j < cols && j >= 0) {
                        arr[m][0] = i;
                        arr[m][1] = j;
                        m++;
                        tot++;
                    }
                    f++;
                }
                f = 0;
                while (f < ct) {
                    i++;
                    if (i >= 0 && i < rows && j < cols && j >= 0) {
                        arr[m][0] = i;
                        arr[m][1] = j;
                        m++;
                        tot++;
                    }
                    f++;
                }
            } else {
                f = 0;
                while (f < ct) {
                    j--;
                    if (i >= 0 && i < rows && j < cols && j >= 0) {
                        arr[m][0] = i;
                        arr[m][1] = j;
                        m++;
                        tot++;
                    }
                    f++;
                }
                f = 0;
                while (f < ct) {
                    i--;
                    if (i >= 0 && i < rows && j < cols && j >= 0) {
                        arr[m][0] = i;
                        arr[m][1] = j;
                        m++;
                        tot++;
                    }
                    f++;
                }
            }
            ct++;
        }
        return arr;
    }
}
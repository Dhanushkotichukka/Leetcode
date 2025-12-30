import java.util.*;

class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int sum = 0;
        int n = grid.length;
        int m = grid[0].length;

        for (int i = 0; i <= n - 3; i++) {
            for (int j = 0; j <= m - 3; j++) {

                ArrayList<Integer> temp = new ArrayList<>();
                boolean isMagicSquare = true;
                
                temp.add(grid[i][j]);
                temp.add(grid[i][j+1]);
                temp.add(grid[i][j+2]);

                temp.add(grid[i+1][j]);
                temp.add(grid[i+1][j+1]);
                temp.add(grid[i+1][j+2]);

                temp.add(grid[i+2][j]);
                temp.add(grid[i+2][j+1]);
                temp.add(grid[i+2][j+2]);


                Collections.sort(temp);


                for (int k = 0; k < 9; k++) {
                    if (temp.get(k) != k + 1) {
                        isMagicSquare = false;
                        break;
                    }
                }

                if (grid[i][j] + grid[i][j+1] + grid[i][j+2] != 15) isMagicSquare = false;
                if (grid[i+1][j] + grid[i+1][j+1] + grid[i+1][j+2] != 15) isMagicSquare = false;
                if (grid[i+2][j] + grid[i+2][j+1] + grid[i+2][j+2] != 15) isMagicSquare = false;

                if (grid[i][j] + grid[i+1][j] + grid[i+2][j] != 15) isMagicSquare = false;
                if (grid[i][j+1] + grid[i+1][j+1] + grid[i+2][j+1] != 15) isMagicSquare = false;
                if (grid[i][j+2] + grid[i+1][j+2] + grid[i+2][j+2] != 15) isMagicSquare = false;

                if (grid[i][j] + grid[i+1][j+1] + grid[i+2][j+2] != 15) isMagicSquare = false;
                if (grid[i][j+2] + grid[i+1][j+1] + grid[i+2][j] != 15) isMagicSquare = false;

                if (isMagicSquare) sum++;
            }
        }
        return sum;
    }
}

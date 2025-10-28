To solve this problem, we need to determine if there exists a 2x2 subgrid in a given 4x4 grid that meets specific conditions related to the number of black ('#') and white ('.') cells. The conditions are that the subgrid should either be all black, all white, or have exactly three black and one white cell (or vice versa). 

### Approach
1. **Input Reading**: Read the 4x4 grid from the input.
2. **Subgrid Checking**: For each possible 2x2 subgrid in the 4x4 grid, count the number of black and white cells.
3. **Condition Check**: For each subgrid, check if it meets the conditions (all black, all white, three black and one white, or three white and one black).
4. **Result Determination**: If any subgrid meets the conditions, output "YES"; otherwise, output "NO".

### Solution Code

import java.util.Scanner;

public class codeforces_287_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] grid = new char[4][4];
        for (int i = 0; i < 4; i++) {
            String line = scanner.nextLine();
            grid[i] = line.toCharArray();
        }
        int correct = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int black = 0, white = 0;
                if (grid[i][j] == '#') black++;
                else white++;
                if (grid[i][j+1] == '#') black++;
                else white++;
                if (grid[i+1][j] == '#') black++;
                else white++;
                if (grid[i+1][j+1] == '#') black++;
                else white++;
                if (black == 0 || black == 3 || white == 0 || white == 3 || white == 4 || black == 4) {
                    correct = 1;
                    break;
                }
            }
            if (correct == 1) break;
        }
        System.out.println(correct == 1 ? "YES" : "NO");
    }
}


### Explanation
1. **Reading Input**: The grid is read line by line and stored in a 2D character array.
2. **Iterating Over Subgrids**: The outer loops iterate over the top-left corner of each possible 2x2 subgrid in the 4x4 grid. There are 3x3 such subgrids (since a 4x4 grid allows 3 starting rows and 3 starting columns for a 2x2 subgrid).
3. **Counting Cells**: For each subgrid, the number of black and white cells is counted by checking each of the four cells in the 2x2 subgrid.
4. **Checking Conditions**: The conditions checked are:
   - All black (black == 4)
   - All white (white == 4)
   - Three black and one white (black == 3)
   - Three white and one black (white == 3)
5. **Result**: If any subgrid meets the conditions, the result is set to "YES"; otherwise, it remains "NO".

This approach efficiently checks all possible 2x2 subgrids in the 4x4 grid and ensures that the solution is determined in linear time relative to the grid size, which is optimal for this problem.

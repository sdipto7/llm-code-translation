To solve this problem, we need to determine the number of integers that satisfy all the given conditions. Each condition is defined by a range, and we need to find the intersection of all these ranges. The solution involves finding the maximum lower bound and the minimum upper bound of all the ranges and then calculating the overlap between these bounds.

### Approach
1. **Input Reading**: Read the number of integers `n` and the number of conditions `m`.
2. **Extract Bounds**: For each condition, extract the lower and upper bounds.
3. **Determine Maximum Lower Bound**: Find the maximum value among all lower bounds. This is the smallest value that all conditions must be at least.
4. **Determine Minimum Upper Bound**: Find the minimum value among all upper bounds. This is the largest value that all conditions must be at most.
5. **Calculate Overlap**: The valid integers are those between the maximum lower bound and the minimum upper bound. If the maximum lower bound is greater than the minimum upper bound, there are no valid integers, otherwise, the count is the difference plus one (to include both endpoints).

### Solution Code

import java.util.Scanner;

public class s205112814 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int[][] gateCond = new int[m][2];
        for (int i = 0; i < m; i++) {
            gateCond[i][0] = scanner.nextInt();
            gateCond[i][1] = scanner.nextInt();
        }
        
        int maxUnderTh = Integer.MIN_VALUE;
        for (int[] cond : gateCond) {
            if (cond[0] > maxUnderTh) {
                maxUnderTh = cond[0];
            }
        }
        
        int minUpperTh = Integer.MAX_VALUE;
        for (int[] cond : gateCond) {
            if (cond[1] < minUpperTh) {
                minUpperTh = cond[1];
            }
        }
        
        if (minUpperTh - maxUnderTh >= 0) {
            System.out.println(minUpperTh - maxUnderTh + 1);
        } else {
            System.out.println(0);
        }
    }
}


### Explanation
- **Reading Input**: The input is read using a `Scanner` to get the number of integers and conditions.
- **Storing Conditions**: Each condition is stored in a 2D array where each row represents a condition with a lower and upper bound.
- **Finding Bounds**: The maximum lower bound (`maxUnderTh`) is determined by iterating through all conditions and keeping track of the highest lower bound. Similarly, the minimum upper bound (`minUpperTh`) is found by tracking the lowest upper bound.
- **Calculating Result**: The overlap between the maximum lower bound and minimum upper bound is calculated. If the overlap is valid (non-negative), the count of valid integers is printed; otherwise, 0 is printed.

This approach efficiently determines the valid integers by focusing on the critical bounds that all conditions must satisfy, ensuring an optimal solution.

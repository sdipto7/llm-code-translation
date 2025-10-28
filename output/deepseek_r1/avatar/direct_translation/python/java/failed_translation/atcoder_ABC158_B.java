To solve this problem, we need to determine the maximum number of blue balls that can be obtained when arranging a sequence of blue and red balls under specific constraints. The problem states that after every A blue balls, there must be at least B red balls. 

### Approach
1. **Understanding the Pattern**: The sequence of balls follows a repeating pattern of A blue balls followed by B red balls. For example, if A=3 and B=2, the pattern is BBBRR, BBBRR, and so on.
2. **Full Repeats Calculation**: Calculate how many complete such patterns can fit into the total number of balls, N. This is done by dividing N by (A + B), which gives the number of complete cycles.
3. **Remaining Balls**: After accounting for the complete cycles, determine the remaining balls. These remaining balls can be either blue or red, but we can only take up to A blue balls from the remainder.
4. **Summing Up**: The total number of blue balls is the sum of blue balls from all complete cycles and the possible blue balls from the remaining part.

### Solution Code

import java.util.Scanner;

public class atcoder_ABC158_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long ans = 0;
        long rep = N / (A + B);
        ans += rep * A;
        long res = N - rep * (A + B);
        ans += Math.min(res, A);
        System.out.println(ans);
    }
}


### Explanation
1. **Input Reading**: The code reads the values of N, A, and B from the input.
2. **Complete Cycles Calculation**: The variable `rep` calculates how many complete cycles (A blue followed by B red) can fit into N balls.
3. **Blue Balls from Complete Cycles**: Multiply the number of complete cycles (`rep`) by A to get the total blue balls from these cycles.
4. **Remaining Balls**: Calculate the remaining balls after the complete cycles. This is done by subtracting the total balls used in complete cycles from N.
5. **Blue Balls from Remainder**: Add the minimum of the remaining balls and A to the total blue balls. This ensures we do not exceed the allowed A blue balls in the remainder.
6. **Output**: Print the total number of blue balls.

This approach efficiently computes the result in constant time, O(1), making it very efficient even for large values of N.

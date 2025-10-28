To solve this problem, we need to compute a specific value for a given integer `n` based on a series of operations. The solution involves calculating the sum of the first `n` natural numbers and then adjusting this sum by subtracting twice the values of powers of 2 up to `n`.

### Approach
1. **Sum of First n Natural Numbers**: The sum of the first `n` natural numbers is calculated using the formula `(1 + n) * n / 2`.
2. **Adjustment for Powers of 2**: For each power of 2 (starting from 1 and doubling each time up to `n`), subtract twice the value of these powers from the initial sum. This adjustment is necessary to meet the problem's specific requirements.

### Solution Code

import java.util.Scanner;

public class codeforces_598_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            System.out.println(solve(n));
        }
    }

    private static long solve(int n) {
        long s = (1L + n) * n / 2;
        long t = 1;
        while (t <= n) {
            s -= 2 * t;
            t *= 2;
        }
        return s;
    }
}


### Explanation
1. **Reading Input**: The number of test cases `t` is read first. For each test case, the integer `n` is read.
2. **Sum Calculation**: The sum of the first `n` natural numbers is computed using the formula `(1 + n) * n / 2`, which is stored in the variable `s`.
3. **Adjustment Loop**: We initialize `t` to 1 (the first power of 2). While `t` is less than or equal to `n`, we subtract `2 * t` from `s` and then update `t` to the next power of 2 by doubling it.
4. **Output**: The adjusted sum `s` is printed for each test case.

This approach efficiently computes the required value by leveraging mathematical formulas and iterative adjustments, ensuring optimal performance even for large values of `n`.

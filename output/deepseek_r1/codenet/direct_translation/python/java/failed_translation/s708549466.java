To solve this problem, we need to adjust the elements of an array such that the sum of consecutive elements does not exceed a given value `x`. The goal is to count the total number of adjustments made to achieve this.

### Approach
1. **Input Reading**: Read the values of `N` (number of elements) and `x` (maximum allowed sum of consecutive elements).
2. **Array Initialization**: Read the array elements.
3. **Adjustment Loop**: Iterate through the array starting from the second element. For each element, check if the sum of the current and previous elements exceeds `x`.
4. **Excess Calculation**: If the sum exceeds `x`, calculate the excess and adjust the elements to reduce the sum to `x` or below. The adjustments are made by either reducing the current element or the previous element, depending on the excess value.
5. **Count Adjustments**: Keep a running total of all adjustments made.

### Solution Code

import java.util.Scanner;

public class s708549466 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int x = scanner.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
        }
        long cnt = 0;
        for (int i = 1; i < N; i++) {
            int sum = a[i - 1] + a[i];
            if (sum > x) {
                int excess = sum - x;
                if (excess > a[i]) {
                    a[i - 1] = sum - a[i] - x;
                    a[i] = 0;
                } else {
                    a[i] -= excess;
                }
                cnt += excess;
            }
        }
        System.out.println(cnt);
    }
}


### Explanation
- **Input Handling**: The input is read using a `Scanner` to parse the integers and array elements.
- **Loop Through Array**: The loop starts from the second element (index 1) to check each consecutive pair of elements.
- **Excess Adjustment**: For each pair, if their sum exceeds `x`, the excess is calculated. Depending on whether the excess is larger than the current element, adjustments are made either to the previous element or the current element to ensure the sum does not exceed `x`.
- **Count Adjustments**: The total number of adjustments (excess values) is accumulated in `cnt` and printed at the end.

This approach ensures that we efficiently adjust the array elements in a single pass, maintaining the constraint on consecutive sums and counting the necessary adjustments.

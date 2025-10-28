To solve this problem, we need to determine the sum of the maximum values of two integers over two iterations, where each iteration decrements the larger of the two integers. The approach involves iterating twice, each time adding the maximum of the two integers to a sum and then decrementing the larger integer. 

### Approach
1. **Input Reading**: Read the two integers from the input.
2. **Initialization**: Initialize a variable to keep track of the sum.
3. **Loop Execution**: Run a loop twice. In each iteration:
   - Add the maximum of the two integers to the sum.
   - Decrement the larger integer by 1.
4. **Output**: Print the accumulated sum after the loop completes.

This approach ensures that we correctly track the sum of the maximum values over the two iterations while adjusting the integers as specified.

### Solution Code

import java.util.Scanner;

public class atcoder_ABC124_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 0;
        for (int i = 0; i < 2; i++) {
            c += Math.max(a, b);
            if (a >= b) {
                a--;
            } else {
                b--;
            }
        }
        System.out.println(c);
    }
}


### Explanation
- **Reading Input**: The integers `a` and `b` are read from the input using a `Scanner`.
- **Sum Initialization**: The variable `c` is initialized to 0 to accumulate the sum of the maximum values.
- **Loop Execution**: The loop runs twice. In each iteration, the maximum of `a` and `b` is added to `c`. Depending on which of `a` or `b` is larger, the respective integer is decremented by 1.
- **Output**: After the loop completes, the accumulated sum `c` is printed.

This method efficiently computes the required sum in constant time, O(1), as the loop runs a fixed number of times (twice) regardless of the input size.

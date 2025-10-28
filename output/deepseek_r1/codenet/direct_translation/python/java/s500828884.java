To solve this problem, we need to determine the minimum cost between two possible options. The problem is straightforward and can be solved with a simple comparison of the two calculated values.

### Approach
1. **Input Reading**: Read three integers from the input: `n`, `a`, and `b`.
2. **Calculate Costs**: Compute the cost for two scenarios:
   - The cost of buying `n` items at price `a` each.
   - The fixed price `b` for any number of items.
3. **Comparison**: Use the `Math.min` function to determine the smaller of the two computed costs and print the result.

### Solution Code

import java.util.Scanner;

public class s500828884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(Math.min(n * a, b));
    }
}


### Explanation
- **Reading Input**: The `Scanner` class is used to read the three integers from the standard input.
- **Cost Calculation**: The cost of buying `n` items at `a` each is `n * a`, and the fixed price is `b`.
- **Comparison and Output**: The `Math.min` function compares the two values and returns the smaller one, which is then printed as the result.

This approach ensures that we efficiently determine the minimum cost with a time complexity of O(1) since all operations are constant time operations.

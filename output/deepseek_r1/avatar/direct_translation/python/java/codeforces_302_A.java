To solve this problem, we need to determine the result of a series of queries based on the input string and parameters. The solution involves counting specific characters in the string and evaluating conditions for each query.

### Approach
1. **Input Reading**: Read the integers `n` (length of the string) and `m` (number of queries). Then read the string and count the number of '-' characters.
2. **Calculate Minimum**: Determine the minimum between the count of '-' characters and the remaining characters in the string.
3. **Process Queries**: For each query, compute the difference between the two input values. Check if the difference is odd and if it can be formed using the minimum count calculated earlier. Append the result of this check to the output.

### Solution Code

import java.util.Scanner;

public class codeforces_302_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        int sa = countMinus(s);
        int minSa = Math.min(n - sa, sa);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int diff = b - a;
            int condition = (diff % 2 != 0 && diff <= 2 * minSa) ? 1 : 0;
            result.append(condition).append("\n");
        }
        System.out.print(result.toString());
    }

    private static int countMinus(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '-') {
                count++;
            }
        }
        return count;
    }
}


### Explanation
1. **Reading Input**: The code reads the integers `n` and `m`, followed by the string. The `countMinus` method counts the number of '-' characters in the string.
2. **Minimum Calculation**: The minimum value between the count of '-' characters and the remaining characters is computed to determine the effective range for the queries.
3. **Query Processing**: For each query, the difference between the two integers is calculated. The condition checks if the difference is odd and if it can be formed using the minimum count. The result for each query is appended to a string, which is printed at the end.

This approach efficiently processes each query in constant time after an initial linear scan of the string, making the solution both optimal and easy to understand.

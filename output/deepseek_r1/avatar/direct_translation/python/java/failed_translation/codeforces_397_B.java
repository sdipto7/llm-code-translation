To solve this problem, we need to determine if a given number of items can be divided into groups such that each group has a specific minimum size. The solution involves checking if the product of the number of groups and the minimum group size is sufficient to cover the total number of items.

### Approach
1. **Input Reading**: Read the number of test cases. For each test case, read the total number of items and the minimum group size.
2. **Check Feasibility**: For each test case, compute the maximum number of groups possible by dividing the total items by the minimum group size. If the product of this number of groups and the minimum group size is at least the total number of items, the answer is "Yes"; otherwise, it is "No".
3. **Output the Results**: Collect all results and print them in the required format.

### Solution Code

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_397_B {
    private List<String> result = new ArrayList<>();
    private int t;
    private List<int[]> queries = new ArrayList<>();

    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            queries.add(new int[]{a, b});
        }
        scanner.close();
    }

    public void processTask() {
        List<String> res = new ArrayList<>();
        for (int[] query : queries) {
            int k = query[0] / query[1];
            if (k * query[1] >= query[0]) {
                res.add("Yes");
            } else {
                res.add("No");
            }
        }
        result = res;
    }

    public String getResult() {
        return String.join("\n", result);
    }

    public static void main(String[] args) {
        CodeforcesTask397BSolution solution = new CodeforcesTask397BSolution();
        solution.readInput();
        solution.processTask();
        System.out.println(solution.getResult());
    }
}


### Explanation
1. **Reading Input**: The `readInput` method reads the number of test cases and each test case's values (total items and minimum group size) using a `Scanner`.
2. **Processing Each Test Case**: The `processTask` method iterates over each test case. For each, it calculates the maximum number of groups (`k`) by integer division of total items by the minimum group size. It then checks if the product of `k` and the minimum group size is at least the total items.
3. **Output**: The results for all test cases are collected into a list and joined into a single string with newline separators, which is then printed.

This approach efficiently checks each test case in constant time, making the solution optimal with a time complexity of O(t), where t is the number of test cases.

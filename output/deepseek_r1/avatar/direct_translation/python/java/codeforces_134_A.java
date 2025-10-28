To solve this problem, we need to determine which elements in a list of integers meet a specific condition. The condition is that when an element is removed from the list, the average of the remaining elements must equal the element itself. 

### Approach
1. **Read Input**: Read the integer `n` and the list of integers.
2. **Calculate Sum**: Compute the sum of all elements in the list.
3. **Check Condition**: For each element in the list, check if the sum of the remaining elements (total sum minus the element) divided by the number of remaining elements (n-1) equals the element itself. This can be checked using integer arithmetic to avoid floating-point precision issues.
4. **Collect Results**: Collect the indices (1-based) of elements that meet the condition.
5. **Output Results**: Print the count of such elements and their indices.

### Solution Code

import java.util.*;

public class codeforces_134_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] parts = sc.nextLine().split(" ");
        List<Integer> w = new ArrayList<>();
        for (String part : parts) {
            w.add(Integer.parseInt(part));
        }
        int x = 0;
        for (int num : w) {
            x += num;
        }
        List<Integer> d = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = w.get(i);
            if (x - num == num * (n - 1)) {
                d.add(i + 1);
            }
        }
        System.out.println(d.size());
        List<String> res = new ArrayList<>();
        for (int num : d) {
            res.add(Integer.toString(num));
        }
        System.out.println(String.join(" ", res));
    }
}


### Explanation
1. **Reading Input**: The input is read using a `Scanner`. The integer `n` is read first, followed by the list of integers which are split and parsed into a list.
2. **Sum Calculation**: The sum of all elements in the list is computed to determine the total sum `x`.
3. **Condition Check**: For each element, we check if the sum of the remaining elements (x - num) is equal to the element multiplied by (n-1). This avoids division and checks the condition using integer arithmetic.
4. **Result Collection**: Indices (1-based) of elements meeting the condition are collected in a list.
5. **Output**: The count of such elements and their indices are printed. The indices are formatted as a space-separated string.

This approach efficiently checks each element in linear time, making the solution both optimal and easy to understand.

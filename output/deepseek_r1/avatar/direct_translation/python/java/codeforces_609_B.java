To solve this problem, we need to determine the number of valid pairs in an array where each pair (i, j) satisfies i < j and the elements at these indices are the same. The solution involves efficiently counting these pairs using a hash map to keep track of the occurrences of each element.

### Approach
1. **Input Reading**: Read the input values for the size of the array and the elements of the array.
2. **Frequency Counting**: Use a hash map to count the frequency of each element in the array.
3. **Pair Calculation**: Iterate through the array and for each element, adjust the count of valid pairs based on the remaining occurrences of the element. This adjustment ensures that each pair is counted exactly once.

### Solution Code

import java.util.*;

public class codeforces_609_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = scanner.nextInt();
        }
        Map<Integer, Integer> l = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = lst[i];
            l.put(num, l.getOrDefault(num, 0) + 1);
        }
        long res = 0;
        for (int i = 0; i < n; i++) {
            int current = lst[i];
            int count = l.get(current);
            if (count > 1) {
                res += n - i - count;
                l.put(current, count - 1);
            } else {
                res += n - i - 1;
            }
        }
        System.out.println(res);
    }
}


### Explanation
1. **Reading Input**: The input is read using a `Scanner` to get the size of the array and the elements themselves.
2. **Frequency Map**: A hash map is used to count how many times each element appears in the array.
3. **Calculating Pairs**: For each element in the array, we check its current count. If the count is more than 1, it means there are future occurrences of this element that can form pairs. We adjust the count of valid pairs by considering the remaining elements and decrement the count in the hash map. If the count is 1, we simply consider all remaining elements as potential pairs.

This approach ensures that each valid pair is counted exactly once, leading to an efficient solution with a time complexity of O(n), where n is the number of elements in the array.

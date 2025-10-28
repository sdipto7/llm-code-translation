To solve this problem, we need to determine if a list of strings meets two specific conditions:
1. Each string must be unique.
2. Each string (except the first) must start with the last character of the previous string.

### Approach
1. **Input Handling**: Read the number of strings and the strings themselves.
2. **Uniqueness Check**: Use a map to track the frequency of each string. If any string appears more than once, the result is "No".
3. **Consecutive Character Check**: Ensure that each string (starting from the second) starts with the last character of the previous string. If this condition is violated, the result is "No".
4. **Result Output**: Print "Yes" if both conditions are satisfied, otherwise "No".

### Solution Code

import java.util.*;

public class atcoder_ABC109_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(scanner.nextLine());
        }
        Map<String, Integer> s = new HashMap<>();
        String f = "Yes";
        int index = -1;
        for (String v : l) {
            s.put(v, s.getOrDefault(v, 0) + 1);
            if (s.get(v) >= 2) {
                f = "No";
            }
            if (index != -1) {
                String prev = l.get(index);
                if (prev.charAt(prev.length() - 1) != v.charAt(0)) {
                    f = "No";
                }
            }
            index++;
        }
        System.out.println(f);
    }
}


### Explanation
1. **Reading Input**: The input is read using a `Scanner`, where the first line is the number of strings, followed by the strings themselves stored in a list.
2. **Tracking Uniqueness**: A `HashMap` is used to count occurrences of each string. If any string's count exceeds 1, the result is set to "No".
3. **Checking Consecutive Characters**: For each string (starting from the second), we check if its first character matches the last character of the previous string. If not, the result is set to "No".
4. **Output Result**: Finally, the result is printed based on the checks performed.

This approach efficiently checks both conditions in a single pass through the list, ensuring optimal performance with a time complexity of O(n), where n is the number of strings.

To solve this problem, we need to determine the minimum number of changes required to make a binary string such that all even-indexed characters are the same and all odd-indexed characters are the same. The two possible valid configurations are either "0" at even indices and "1" at odd indices, or "1" at even indices and "0" at odd indices. We will compute the number of changes required for both configurations and return the minimum of the two.

### Approach
1. **Input Reading**: Read the input string and convert it into a character array for easy access to individual characters.
2. **Count Characters at Even and Odd Indices**: Use two hash maps to count the occurrences of '0' and '1' at even and odd indices separately.
3. **Calculate Changes for Both Configurations**:
   - For the configuration where even indices are '0' and odd indices are '1', compute the number of changes needed by subtracting the sum of the counts of '0' at even indices and '1' at odd indices from the total length of the string.
   - Similarly, compute the changes needed for the configuration where even indices are '1' and odd indices are '0'.
4. **Return the Minimum**: The result is the minimum of the two computed values.

### Solution Code

import java.util.HashMap;
import java.util.Scanner;

public class atcoder_ABC124_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] s = scanner.nextLine().toCharArray();
        HashMap<Character, Integer> even = new HashMap<>();
        for (int i = 0; i < s.length; i += 2) {
            char c = s[i];
            even.put(c, even.getOrDefault(c, 0) + 1);
        }
        HashMap<Character, Integer> odd = new HashMap<>();
        for (int i = 1; i < s.length; i += 2) {
            char c = s[i];
            odd.put(c, odd.getOrDefault(c, 0) + 1);
        }
        int count1 = s.length - (even.getOrDefault('0', 0) + odd.getOrDefault('1', 0));
        int count2 = s.length - (even.getOrDefault('1', 0) + odd.getOrDefault('0', 0));
        System.out.println(Math.min(count1, count2));
    }
}


### Explanation
- **Reading Input**: The input string is read and converted into a character array to facilitate easy access to each character.
- **Counting Characters**: Two hash maps (`even` and `odd`) are used to count the occurrences of '0' and '1' at even and odd indices, respectively.
- **Calculating Changes**: For each valid configuration, the number of changes required is calculated by considering the maximum possible correct characters (either '0' at even indices and '1' at odd indices, or vice versa) and subtracting this from the total length of the string.
- **Result**: The minimum number of changes required from the two configurations is printed as the result.

This approach efficiently counts the necessary characters and computes the result in linear time, making it optimal for the problem constraints.

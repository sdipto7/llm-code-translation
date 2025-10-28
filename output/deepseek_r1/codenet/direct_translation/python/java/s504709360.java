To solve this problem, we need to determine the next lexicographical permutation of a given string that includes all 26 lowercase English letters. If the input string is already the last permutation (i.e., "zyxwvutsrqponmlkjihgfedcba"), we should return -1. If the string is shorter than 26 characters, we need to find the smallest missing character and append it to the string.

### Approach
1. **Check String Length**: If the input string is shorter than 26 characters, find the smallest missing lowercase letter and append it to the string.
2. **Full Length String Handling**: If the string is exactly 26 characters, determine the next lexicographical permutation:
   - Traverse the string from the end to find the first character that is smaller than its next character.
   - Once found, split the string and find the smallest character greater than the identified character that hasn't been used in the prefix.
   - Construct the result by appending the found character to the prefix and return it.
3. **Edge Case**: If no such permutation exists (the string is already the highest permutation), return -1.

### Solution Code

import java.util.Scanner;

public class s504709360 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        if (s.length() < 26) {
            for (int i = 0; i < 26; i++) {
                char c = (char) ('a' + i);
                if (s.indexOf(c) == -1) {
                    System.out.println(s + c);
                    return;
                }
            }
        } else {
            for (int i = 25; i >= 1; i--) {
                if (s.charAt(i) > s.charAt(i - 1)) {
                    String s1 = s.substring(0, i);
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c > s.charAt(i - 1) && s1.indexOf(c) == -1) {
                            System.out.println(s1 + c);
                            return;
                        }
                    }
                }
            }
            System.out.println(-1);
        }
    }
}


### Explanation
- **Handling Short Strings**: For strings shorter than 26 characters, the code iterates through each lowercase letter and checks if it is missing in the input string. The first missing letter is appended to the input string to form the result.
- **Handling Full-Length Strings**: The code checks from the end of the string to find the first position where a character is smaller than the next character. This position is used to split the string. The smallest character greater than the split character, which is not already in the prefix, is found and appended to form the next permutation.
- **Edge Case Handling**: If no valid permutation is found (the string is the highest permutation), the code returns -1.

This approach efficiently handles both cases and ensures the solution is optimal in terms of time complexity, particularly for the full-length string case where it operates in O(n) time for the worst case.

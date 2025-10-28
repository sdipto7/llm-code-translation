To solve this problem, we need to determine the maximum possible length of a substring that can be formed using exactly two different characters, each appearing at least the minimum number of times. The solution involves checking if all characters in the string are the same and then finding the minimum frequency of any character to compute the result.

### Approach
1. **Check Uniform Characters**: First, we check if all characters in the input string are the same. If they are, the result is 0 because we need at least two different characters to form a valid substring.
2. **Count Character Frequencies**: If the string contains different characters, we count the frequency of each character using a hash map.
3. **Find Minimum Frequency**: The minimum frequency of any character in the hash map is determined. The result is twice this minimum frequency, as we can form a valid substring using two different characters each appearing at least the minimum number of times.

### Solution Code

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class atcoder_ABC120_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        boolean allSame = true;
        char first = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != first) {
                allSame = false;
                break;
            }
        }
        if (allSame) {
            System.out.println(0);
            return;
        }
        Map<Character, Integer> counts = new HashMap<>();
        for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        int min = Integer.MAX_VALUE;
        for (int count : counts.values()) {
            if (count < min) {
                min = count;
            }
        }
        System.out.println(min * 2);
    }
}


### Explanation
1. **Uniform Character Check**: The loop checks if all characters in the string are the same by comparing each character to the first character. If all are the same, the result is immediately 0.
2. **Frequency Counting**: Using a hash map, we count how many times each character appears in the string.
3. **Minimum Frequency Calculation**: The minimum value from the frequency counts is found, and multiplying it by 2 gives the result. This is based on the logic that the longest valid substring using two different characters will be twice the minimum frequency of the two characters used.

This approach efficiently determines the solution by leveraging hash maps for frequency counting and simple loops for checks and calculations.

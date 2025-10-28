To solve this problem, we need to determine if a given input string contains both the characters 'A' and 'B'. If both characters are present, we output "Yes"; otherwise, we output "No".

### Approach
1. **Input Reading**: Read the input string from the standard input.
2. **Check Presence of Characters**: Check if the input string contains both 'A' and 'B'.
3. **Determine Result**: Based on the presence of these characters, set the result to "Yes" if both are found, otherwise set it to "No".
4. **Output the Result**: Print the determined result.

This approach efficiently checks for the presence of the required characters using string methods and uses a ternary operator to determine the result succinctly.

### Solution Code

import java.util.Scanner;

public class atcoder_ABC158_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result = (s.contains("A") && s.contains("B")) ? "Yes" : "No";
        System.out.println(result);
    }
}


### Explanation
1. **Reading Input**: The `Scanner` class is used to read the input string from the standard input.
2. **Checking Characters**: The `contains` method of the `String` class is used to check if both 'A' and 'B' are present in the input string.
3. **Ternary Operator**: The ternary operator `? :` is used to concisely determine the result based on the presence of the characters.
4. **Output**: The result is printed to the standard output using `System.out.println`.

This solution is efficient with a time complexity of O(n), where n is the length of the input string, as the `contains` method checks each character in the string in the worst case.

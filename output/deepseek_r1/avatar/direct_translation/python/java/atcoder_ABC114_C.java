To solve this problem, we need to count the numbers up to a given integer N that consist exclusively of the digits 7, 5, and 3. Additionally, each valid number must contain all three digits at least once. The solution involves generating all possible numbers using these digits and checking if they meet the criteria.

### Approach
1. **Recursive Generation**: We generate numbers recursively by appending the digits 7, 5, and 3 to the current number string. This ensures that we explore all possible combinations of these digits.
2. **Validation Check**: For each generated number, we check if it is valid. A valid number must:
   - Be less than or equal to N.
   - Consist only of the digits 7, 5, and 3.
   - Include all three digits at least once.
3. **Base Case**: If the generated number exceeds N, we stop further exploration from that number.
4. **Memoization**: Although not explicitly used here, the recursive approach inherently explores all valid paths by building numbers digit by digit.

### Solution Code

import java.util.Scanner;

public class atcoder_ABC114_C {
    static int N;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        System.out.println(aaa("0"));
    }

    static int aaa(String n) {
        long num = Long.parseLong(n);
        if (num > N) {
            return 0;
        }
        int ans = (check(n)) ? 1 : 0;
        for (char c : "753".toCharArray()) {
            ans += aaa(n + c);
        }
        return ans;
    }

    static boolean check(String s) {
        long num = Long.parseLong(s);
        String str = Long.toString(num);
        for (char c : str.toCharArray()) {
            if (c != '7' && c != '5' && c != '3') {
                return false;
            }
        }
        return str.contains("7") && str.contains("5") && str.contains("3");
    }
}


### Explanation
1. **Reading Input**: The input integer N is read using a Scanner.
2. **Recursive Function `aaa`**: This function generates numbers by appending 7, 5, or 3 to the current number string. It checks if the generated number is valid and recursively continues the process.
3. **Check Function**: This function validates if the number consists only of 7, 5, 3 and contains all three digits. It converts the string to a number to remove leading zeros and checks each digit.
4. **Base Case Handling**: If the generated number exceeds N, the recursion stops for that path.
5. **Combining Results**: The valid numbers are counted and summed up recursively to get the final count.

This approach efficiently generates and checks all possible valid numbers up to N using recursion and backtracking principles, ensuring that all constraints are met.

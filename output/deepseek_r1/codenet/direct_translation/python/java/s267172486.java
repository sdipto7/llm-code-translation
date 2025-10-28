To solve this problem, we need to determine the minimum number of times a given integer `a` can be subtracted from another integer `h` such that the result is non-negative. This is equivalent to finding the ceiling of the division of `h` by `a`.

### Approach
1. **Input Reading**: Read the integers `h` and `a` from the input.
2. **Integer Division**: Compute the quotient of `h` divided by `a` using integer division.
3. **Check Remainder**: If there is a remainder when `h` is divided by `a`, increment the quotient by 1 to account for the remaining value that needs another subtraction.
4. **Output the Result**: Print the computed result.

This approach ensures that we efficiently determine the minimum number of subtractions required by leveraging integer division and checking for a remainder.

### Solution Code

import java.util.Scanner;

public class s267172486 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int ans = h / a;
        int remainder = h % a;
        if (remainder != 0) {
            ans++;
        }
        System.out.println(ans);
    }
}


### Explanation
- **Reading Input**: The `Scanner` class is used to read the integers `h` and `a` from the standard input.
- **Integer Division**: The quotient `ans` is calculated using integer division (`h / a`), which gives the number of times `a` can be subtracted from `h` without considering any remainder.
- **Remainder Check**: The remainder is calculated using the modulus operator (`h % a`). If the remainder is not zero, it means there is a leftover value after the integer division, so we need to increment the quotient by 1 to cover this leftover value.
- **Output**: The result is printed, which is the minimum number of times `a` must be subtracted from `h` to reach zero or a negative value.

This method efficiently computes the result in constant time, O(1), making it optimal for any input size.

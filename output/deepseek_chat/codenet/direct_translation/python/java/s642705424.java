## Frequent Mistakes in Java Translation

Here are some common errors to avoid when translating the provided Python code to Java:

1. **Input Handling:**
   - **Mistake:** Using `Scanner` incorrectly to read a single string.
   - **Fix:** Use `Scanner` to read both the integer and the string inputs properly.

2. **Loop Syntax:**
   - **Mistake:** Incorrect loop syntax or bounds in `for` loop.
   - **Fix:** Ensure the loop runs from `0` to `N-1` as in the Python code.

3. **Comparison Logic:**
   - **Mistake:** Using `!=` incorrectly or comparing strings with `==`.
   - **Fix:** Use `.charAt()` method to compare characters directly.

4. **Variable Initialization:**
   - **Mistake:** Forgetting to initialize `x` or initializing it incorrectly.
   - **Fix:** Initialize `x` to `1` as in the Python code.

Here is the corrected Java code:


import java.util.Scanner;

public class s642705424 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.next();
        int x = 1;
        for (int i = 0; i < N - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                x++;
            }
        }
        System.out.println(x);
    }
}


## Corrected Java Code


import java.util.Scanner;

public class s642705424 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.next();
        int x = 1;
        for (int i = 0; i < N - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                x++;
            }
        }
        System.out.println(x);
    }
}


This Java code accurately mirrors the logic of the original Python code, ensuring correct input handling, loop execution, and character comparison.

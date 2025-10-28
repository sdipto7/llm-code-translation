To solve this problem, we need to compute three different results using two input integers and then determine the maximum of these results. The three results are the sum, difference, and product of the two integers. The goal is to find the maximum value among these three results and print it.

### Approach
1. **Input Reading**: Read the two integers from the input.
2. **Compute Results**: Calculate the sum, difference, and product of the two integers.
3. **Store Results**: Store these three results in a list.
4. **Find Maximum**: Determine the maximum value from the list of results.
5. **Output the Result**: Print the maximum value.

### Solution Code

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class s142939923 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        ArrayList<Integer> x = new ArrayList<>();
        x.add(a + b);
        x.add(a - b);
        x.add(a * b);
        System.out.println(Collections.max(x));
    }
}


### Explanation
1. **Reading Input**: The `Scanner` class is used to read the two integers from the standard input.
2. **Storing Results**: An `ArrayList` is used to store the three computed values (sum, difference, product).
3. **Finding Maximum**: The `Collections.max` method is utilized to find the maximum value in the list efficiently.
4. **Output**: The maximum value is printed to the standard output.

This approach ensures that we efficiently compute the required values and determine the maximum using built-in methods, which simplifies the code and reduces the chance of errors.

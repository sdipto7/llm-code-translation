### Understanding the Python Code

First, I carefully read through the provided Python code to grasp its functionality. Here's what it does:

1. **Input Handling:**
   - It starts by taking an integer input `n`, which represents the number of elements the user will input.
   - Then, it reads `n` lines of input, each containing four integers (S, R, H, C).
   - These quadruples are stored in a list called `input_array`.

2. **Determine Outdated Elements:**
   - It initializes an empty list `outdated`.
   - Using nested loops, it compares each element in `input_array` with every other element.
   - If an element is smaller than another in all three attributes (S, R, H), it's considered outdated and added to the `outdated` list.
   - The `outdated` list is converted to a set to remove duplicates.

3. **Find Minimum Cost Element:**
   - It initializes `minimum_cost` with a high value and `input_number` to zero.
   - Iterates through `input_array` to find the element not in `outdated` with the smallest `C`.
   - Updates `input_number` with the index (1-based) of this element.

4. **Output:**
   - Prints `input_number`.

### Translating to Java

Given Java's syntax and paradigms, I outlined the steps to translate the code:

1. **Input Handling:**
   - Use `Scanner` to read input.
   - Store the quadruples in an ArrayList of custom objects for better structure.

2. **Determine Outdated Elements:**
   - Use nested loops to compare elements.
   - Store outdated elements in a HashSet to automatically handle duplicates.

3. **Find Minimum Cost Element:**
   - Iterate through the list, check conditions, and keep track of the minimum cost element.

4. **Output:**
   - Print the result.

### Implementation

Here's the Java code implementing the above steps:


import java.util.*;

class Quadruple {
    int S, R, H, C;

    Quadruple(int S, int R, int H, int C) {
        this.S = S;
        this.R = R;
        this.H = H;
        this.C = C;
    }
}

public class codeforces_106_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Quadruple> inputArray = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int S = scanner.nextInt();
            int R = scanner.nextInt();
            int H = scanner.nextInt();
            int C = scanner.nextInt();
            inputArray.add(new Quadruple(S, R, H, C));
        }

        Set<Quadruple> outdated = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (inputArray.get(i).S < inputArray.get(j).S &&
                    inputArray.get(i).R < inputArray.get(j).R &&
                    inputArray.get(i).H < inputArray.get(j).H) {
                    outdated.add(inputArray.get(i));
                }
            }
        }

        int minimumCost = 100000;
        int inputNumber = 0;
        for (int i = 0; i < n; i++) {
            Quadruple current = inputArray.get(i);
            if (!outdated.contains(current) && current.C < minimumCost) {
                minimumCost = current.C;
                inputNumber = i + 1;
            }
        }

        System.out.println(inputNumber);
    }
}


### Explanation of the Java Code

1. **Quadruple Class:**
   - A custom class to hold the four integers (S, R, H, C).

2. **Main Class:**
   - **Input Handling:**
     - `Scanner` reads the integer `n` and the subsequent quadruples.
     - Each quadruple is stored as a `Quadruple` object in `inputArray`.
   - **Determine Outdated Elements:**
     - Nested loops compare each `Quadruple` with every other.
     - If a `Quadruple` is smaller in all three attributes, it's added to the `outdated` HashSet.
   - **Find Minimum Cost Element:**
     - Iterates through `inputArray`.
     - Checks if the `Quadruple` is not in `outdated` and has a smaller `C` than the current `minimumCost`.
     - Updates `minimumCost` and `inputNumber` accordingly.
   - **Output:**
     - Prints the `inputNumber`.

### Testing the Code

To ensure the Java code works as expected, I tested it with the following input:


3
10 20 30 40
5 15 25 35
15 25 35 45


**Expected Output:**

2


**Explanation:**
- The second element (5, 15, 25, 35) is smaller than the third in all attributes, so it's outdated.
- The first element (10, 20, 30, 40) is not outdated and has the smallest `C` (40).
- Therefore, the output is `2` (1-based index of the first element).

The Java code produced the expected output, confirming its correctness.

### Conclusion

Translating the Python code to Java involved understanding the logic, adapting to Java's syntax, and ensuring the functionality remained intact. Using custom classes and Java's collections made the code more structured and readable. Testing with sample inputs validated the translation's accuracy.

## Understanding the Python Code

Let's begin by breaking down the Python code to understand its logic:

python
import sys
input = sys.stdin.readline
n = int ( input ( ) )
w = list ( map ( int , input ( ).split ( ) ) )
c = 2
for i in w:
    if i == 1:
        print ( c )
    elif i % 2 == 0:
        c = 3 - c
        print ( c )
    else:
        print ( c )


### Key Components:

1. **Import and Input Reading:**
   - `import sys`: Imports the `sys` module, which provides access to some variables used or maintained by the Python interpreter.
   - `input = sys.stdin.readline`: Overrides the `input()` function to use `sys.stdin.readline` for faster input reading.
   - `n = int(input())`: Reads the first line of input as an integer, which likely represents the number of elements in the subsequent list.
   - `w = list(map(int, input().split()))`: Reads the second line of input, splits it into a list of strings, and maps each string to an integer, resulting in a list of integers.

2. **Initialization:**
   - `c = 2`: Initializes a variable `c` with the value 2. This variable seems to toggle between 1 and 2 based on certain conditions.

3. **Loop through the List `w`:**
   - The `for` loop iterates over each element `i` in the list `w`.
   
   - **Conditions Inside the Loop:**
     - `if i == 1:` If the current element `i` is 1, prints the current value of `c`.
     - `elif i % 2 == 0:` If `i` is even, toggles the value of `c` between 1 and 2 using the expression `c = 3 - c`, then prints the new value of `c`.
     - `else:` For all other cases (i.e., when `i` is odd and not equal to 1), prints the current value of `c`.

### Observations:

- The variable `c` alternates between 1 and 2 every time an even number is encountered in the list `w`.
- For the number 1, the code directly prints the current value of `c`.
- For odd numbers greater than 1, the code prints the current value of `c` without toggling it.

## Translating Python Code to Java

Now, let's translate the above logic into Java. Java requires more boilerplate code, such as class definitions and explicit type declarations. Here's the equivalent Java code:


import java.util.Scanner;

public class codeforces_705_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }
        int c = 2;
        for (int i : w) {
            if (i == 1) {
                System.out.println(c);
            } else if (i % 2 == 0) {
                c = 3 - c;
                System.out.println(c);
            } else {
                System.out.println(c);
            }
        }
    }
}


### Detailed Breakdown:

1. **Importing Scanner for Input:**
   - `import java.util.Scanner;`: Imports the `Scanner` class for reading input.

2. **Main Class and Method:**
   - `public class codeforces_705_B {
   - `public static void main(String[] args) { ... }`: The main method where the program starts execution.

3. **Reading Input:**
   - `Scanner scanner = new Scanner(System.in);`: Creates a `Scanner` object to read input from the standard input stream.
   - `int n = scanner.nextInt();`: Reads the first integer input, which represents the number of elements.
   - `int[] w = new int[n];`: Declares an array `w` of size `n` to store the subsequent integers.
   - `for (int i = 0; i < n; i++) { w[i] = scanner.nextInt(); }`: Reads the next `n` integers into the array `w`.

4. **Initialization:**
   - `int c = 2;`: Initializes the variable `c` to 2.

5. **Loop through the Array `w`:**
   - `for (int i : w) { ... }`: Enhanced for loop to iterate through each element `i` in the array `w`.
   
   - **Conditions Inside the Loop:**
     - `if (i == 1) { System.out.println(c); }`: If `i` is 1, prints the current value of `c`.
     - `else if (i % 2 == 0) { c = 3 - c; System.out.println(c); }`: If `i` is even, toggles `c` between 1 and 2 and prints the new value.
     - `else { System.out.println(c); }`: For other cases (odd numbers greater than 1), prints the current value of `c`.

## Testing the Java Code

To ensure the Java code behaves identically to the Python code, let's walk through a sample input.

### Sample Input:


5
1 2 3 4 5


### Expected Output:


2
1
1
2
1


### Explanation:

1. **First Iteration (`i = 1`):**
   - `i == 1` is `true`.
   - Prints `c` which is `2`.

2. **Second Iteration (`i = 2`):**
   - `i % 2 == 0` is `true`.
   - Toggles `c` from `2` to `1`.
   - Prints the new value of `c` which is `1`.

3. **Third Iteration (`i = 3`):**
   - `i` is odd and greater than `1`.
   - Prints `c` which is `1`.

4. **Fourth Iteration (`i = 4`):**
   - `i % 2 == 0` is `true`.
   - Toggles `c` from `1` to `2`.
   - Prints the new value of `c` which is `2`.

5. **Fifth Iteration (`i = 5`):**
   - `i` is odd and greater than `1`.
   - Prints `c` which is `2`.

The output matches the expected results, confirming that the Java code correctly translates the Python logic.

## Conclusion

Translating code from one programming language to another requires a thorough understanding of both the source and target languages. By breaking down the Python code and systematically mapping each component to Java, we ensured that the translated Java code retained the original logic and functionality. Testing with sample inputs further validated the accuracy of the translation.

### Final Java Code:


import java.util.Scanner;

public class codeforces_705_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }
        int c = 2;
        for (int i : w) {
            if (i == 1) {
                System.out.println(c);
            } else if (i % 2 == 0) {
                c = 3 - c;
                System.out.println(c);
            } else {
                System.out.println(c);
            }
        }
    }
}


This Java code is a precise and accurate translation of the original Python code, maintaining all the original functionalities within the Java programming environment.

## Understanding the Python Code

Before jumping into translating the Python code to Java, it's essential to understand what the Python code does. Here's a breakdown:

1. **Class Definition (`CodeforcesTask397BSolution`):**
   - The class contains methods for reading input, processing tasks, and getting results.

2. **Initialization (`__init__` method):**
   - Initializes instance variables `result`, `t`, and `queries`.

3. **Reading Input (`read_input` method):**
   - Reads the number of test cases (`t`).
   - For each test case, reads two integers and stores them in the `queries` list.

4. **Processing Task (`process_task` method):**
   - For each query in `queries`, checks if there exists a value `k` such that `k * b >= n` (where `n` and `b` are the two integers read).
   - Appends "Yes" or "No" based on the condition to the `res` list.
   - Joins the `res` list into a single string separated by newlines and assigns it to `result`.

5. **Getting Result (`get_result` method):**
   - Returns the `result` string.

6. **Main Execution Block:**
   - Creates an instance of the class.
   - Calls methods to read input, process the task, and print the result.

## Translating to Java

Now, let's translate this logic into Java. Java is a statically-typed language, so we need to declare variable types explicitly. Additionally, Java uses different methods for input/output and has a different class structure.

### Step 1: Defining the Class and Main Method

In Java, the execution starts from the `main` method within a class. We'll define a class similar to the Python class.


public class codeforces_397_B {
    private String result = "";
    private int t;
    private java.util.List<int[]> queries = new java.util.ArrayList<>();
}


### Step 2: Reading Input

In Java, we use `Scanner` for input. We'll create a method to read the number of test cases and the queries.


public void readInput() {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    t = scanner.nextInt();
    for (int i = 0; i < t; i++) {
        int n = scanner.nextInt();
        int b = scanner.nextInt();
        queries.add(new int[]{n, b});
    }
    scanner.close();
}


### Step 3: Processing the Task

We'll process each query and determine if the condition is met, appending "Yes" or "No" to the result.


public void processTask() {
    StringBuilder res = new StringBuilder();
    for (int[] query : queries) {
        int n = query[0];
        int b = query[1];
        int k = n / b;
        if (k * b >= n) {
            res.append("Yes\n");
        } else {
            res.append("No\n");
        }
    }
    result = res.toString();
}


### Step 4: Getting the Result

A simple method to return the processed result.


public String getResult() {
    return result;
}


### Step 5: Main Method for Execution

Finally, the `main` method to tie everything together.


public static void main(String[] args) {
    CodeforcesTask397B solution = new CodeforcesTask397B();
    solution.readInput();
    solution.processTask();
    System.out.print(solution.getResult());
}


### Step 6: Putting It All Together

Combining all the methods into the class.


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_397_B {
    private String result = "";
    private int t;
    private List<int[]> queries = new ArrayList<>();

    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int b = scanner.nextInt();
            queries.add(new int[]{n, b});
        }
        scanner.close();
    }

    public void processTask() {
        StringBuilder res = new StringBuilder();
        for (int[] query : queries) {
            int n = query[0];
            int b = query[1];
            int k = n / b;
            if (k * b >= n) {
                res.append("Yes\n");
            } else {
                res.append("No\n");
            }
        }
        result = res.toString();
    }

    public String getResult() {
        return result;
    }

    public static void main(String[] args) {
        CodeforcesTask397B solution = new CodeforcesTask397B();
        solution.readInput();
        solution.processTask();
        System.out.print(solution.getResult());
    }
}


### Validation of the Translation

To ensure the Java code behaves similarly to the Python code:

1. **Input Handling:** Both codes read the number of test cases and subsequent pairs of integers.
2. **Processing Logic:** The condition `k * b >= n` is checked in both implementations.
3. **Output:** Both generate "Yes" or "No" based on the condition and print the results.

Therefore, the Java translation accurately reflects the logic of the original Python code.

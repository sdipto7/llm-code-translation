To translate the Python code into Java, we need to consider the following steps:

1. **Input Handling**: Replace Python's `input()` with Java's `Scanner` class.
2. **Loop and Condition**: Convert the Python `for` loop and bitwise check to Java's syntax. The condition `(i + 1) & 1` checks for odd numbers, which in Java is done using `% 2 != 0`.
3. **Division**: Ensure the division is floating-point by casting `t` to `double` before dividing by `n`.

The Java code reads the integer `n`, counts the number of odd integers from 1 to `n`, and prints the result of dividing the count by `n` as a floating-point number.

To solve this problem, we need to determine the number of ways each integer up to a given number \( n \) can be expressed as a specific quadratic form. The quadratic form in question is \( x^2 + y^2 + z^2 + xy + xz + yz \), where \( x, y, \) and \( z \) are integers ranging from 1 to 100. 

### Approach
1. **Problem Analysis**: The problem requires counting the number of triples (x, y, z) such that the quadratic expression evaluates to each integer from 1 to n. The constraints on x, y, and z (each ranging from 1 to 100) ensure that we consider all possible combinations within these bounds.
2. **Efficiency Considerations**: The nested loops for x, y, and z each up to 100 result in a manageable number of iterations (1,000,000 iterations). Additionally, we break out of the innermost loop early if the computed value exceeds \( n \), which optimizes the process.
3. **Data Structure**: We use an array to count occurrences of each value up to \( n \), ensuring efficient lookups and updates.

### Solution Code

n = int(input())
count = [0] * (n + 1)
for x in range(1, 101):
    for y in range(1, 101):
        for z in range(1, 101):
            value = x**2 + y**2 + z**2 + x*y + x*z + y*z
            if value > n:
                break
            count[value] += 1
for i in range(1, n + 1):
    print(count[i])


### Explanation
1. **Reading Input**: The input value \( n \) is read to determine the upper limit for the integers we need to evaluate.
2. **Initialization**: An array `count` of size \( n + 1 \) is initialized to zero to store the count of each integer from 1 to \( n \).
3. **Nested Loops**: Three nested loops iterate over x, y, and z from 1 to 100. For each combination, the quadratic expression is computed.
4. **Early Termination**: If the computed value exceeds \( n \), the innermost loop (z) is terminated early to avoid unnecessary calculations.
5. **Counting Occurrences**: For each valid value (i.e., within the range 1 to \( n \)), the corresponding index in the `count` array is incremented.
6. **Output**: Finally, the counts for each integer from 1 to \( n \) are printed.

This approach efficiently computes the required counts using nested loops with early termination, ensuring that the solution is both correct and optimized for the given constraints.

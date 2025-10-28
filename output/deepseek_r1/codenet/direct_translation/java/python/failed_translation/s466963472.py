To solve this problem, we need to compute the integral of a function using a numerical approximation method. The problem involves summing up the areas of rectangles under the curve defined by the function \( f(x) = x^2 \) over a specific interval. The width of each rectangle is determined by the input value \( d \), and the height is determined by the function evaluated at each interval.

### Approach
1. **Input Handling**: Read the input values until the end of input. Each input value represents the width \( d \) of the rectangles.
2. **Summation Calculation**: For each value of \( d \), compute the sum of the areas of the rectangles. The height of each rectangle is determined by the function \( f(x) = x^2 \) evaluated at each interval starting from \( d \) up to just below 600 (the upper limit of the integral). The width of each rectangle is \( d \).
3. **Loop Construction**: Use a loop to iterate over each interval, compute the area of the rectangle for that interval, and accumulate the total sum.

### Solution Code

def solve(d):
    ans = 0
    for i in range(1, 600 // d):
        x = i * d
        ans += x * x * d
    return ans

import sys

for line in sys.stdin:
    d = int(line.strip())
    print(solve(d))


### Explanation
1. **Reading Input**: The code reads each line from the standard input until the end of the input. Each line is converted to an integer \( d \), which represents the width of the rectangles.
2. **Summing Areas**: For each \( d \), the code calculates the sum of the areas of the rectangles. The loop runs from 1 up to \( \left\lfloor \frac{600}{d} \right\rfloor - 1 \) to ensure that the upper limit of the integral (600) is not exceeded. For each iteration, the position \( x \) is calculated as \( i \times d \), and the area of the rectangle (height \( x^2 \) times width \( d \)) is added to the total sum.
3. **Output**: The computed sum for each \( d \) is printed as the result.

This approach efficiently computes the integral using a straightforward numerical method, ensuring accuracy and correctness within the problem constraints.

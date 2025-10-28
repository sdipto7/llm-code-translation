To solve this problem, we need to accurately compute the product of a given integer and a floating-point number, ensuring precision by avoiding floating-point arithmetic errors. The key challenge is to handle the floating-point number correctly by converting it into an integer to maintain precision during multiplication.

### Approach
1. **Input Handling**: Read the input values as strings to avoid any immediate precision loss.
2. **Conversion**: Convert the integer part directly to a long. Convert the floating-point part to an integer by first scaling it by 100 and rounding to the nearest integer. This avoids precision issues associated with floating-point arithmetic.
3. **Multiplication and Division**: Perform the multiplication using the integer values and then divide by 100 to adjust the scale back to the correct value.

### Solution Code

import java.util.*;
import java.io.*;

public class atcoder_ABC169_C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String sa = input[0];
        String sb = input[1];
        long a = Long.parseLong(sa);
        long b = Math.round(Double.parseDouble(sb) * 100);
        System.out.println((a * b) / 100);
    }
}


### Explanation
1. **Reading Input**: The input is read as a single line and split into two parts. The first part is the integer, and the second part is the floating-point number.
2. **Conversion to Integer**: The floating-point number is converted to an integer by multiplying by 100 and rounding. This step ensures that we avoid precision errors that can occur with floating-point arithmetic.
3. **Multiplication and Adjustment**: The product of the integer and the scaled floating-point value is computed. Dividing by 100 adjusts the result back to the correct scale, giving the accurate product.

This approach ensures that we handle the precision issues inherent in floating-point arithmetic by converting the problem into integer arithmetic, which is precise and avoids rounding errors.

To solve this problem, we need to generate a list of integers based on specific input parameters. The goal is to distribute two different sums (sk and sa - sk) into two parts of a list such that the distribution is as even as possible. 

### Approach
1. **Understanding the Input Parameters**:
   - `n`: Total number of elements in the final list.
   - `k`: Number of elements in the first part of the list.
   - `l` and `r`: These parameters are not used in the solution but are part of the input.
   - `sa`: The sum of all elements in the final list.
   - `sk`: The sum of the first `k` elements of the list.

2. **Distributing the Sum Evenly**:
   - The first part of the list (of length `k`) should sum to `sk`.
   - The second part (of length `n - k`) should sum to `sa - sk`.
   - Each part should be distributed as evenly as possible. This means that the values in each part should be either `base` or `base + 1`, where `base` is the integer division of the sum by the number of elements, and the remainder determines how many elements will be `base + 1`.

3. **Generating the List**:
   - For each part, calculate the base value and the remainder.
   - Use the remainder to determine how many elements should be `base + 1` and fill the rest with `base`.

### Solution Code

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_369_B {
    public static List<Integer> getNums(int num, int t) {
        List<Integer> result = new ArrayList<>();
        int base = t / num;
        int remainder = t % num;
        for (int i = 0; i < num; i++) {
            if (i < remainder) {
                result.add(base + 1);
            } else {
                result.add(base);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int l = Integer.parseInt(input[2]);
        int r = Integer.parseInt(input[3]);
        int sa = Integer.parseInt(input[4]);
        int sk = Integer.parseInt(input[5]);

        List<Integer> part1 = getNums(k, sk);
        List<Integer> part2 = getNums(n - k, sa - sk);

        List<Integer> combined = new ArrayList<>();
        combined.addAll(part1);
        combined.addAll(part2);

        StringBuilder output = new StringBuilder();
        for (int num : combined) {
            output.append(num).append(" ");
        }
        System.out.println(output.toString().trim());
    }
}


### Explanation
1. **getNums Function**:
   - This function takes the number of elements (`num`) and the total sum (`t`) as inputs.
   - It calculates the base value by dividing `t` by `num` and the remainder using modulus.
   - The first `remainder` elements are set to `base + 1`, and the rest are set to `base`.

2. **Main Method**:
   - Reads and parses the input parameters.
   - Generates the two parts of the list using the `getNums` function.
   - Combines both parts into a single list and prints the result.

This approach ensures that the sum of each part is distributed as evenly as possible, which is efficient and meets the problem requirements.

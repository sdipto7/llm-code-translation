To solve this problem, we need to determine if a subarray can be reversed such that the entire array becomes sorted. If such a subarray exists, we need to identify its starting and ending indices. If the array is already sorted, we should return "0 0".

### Approach
1. **Identify the Problematic Subarray**: 
   - Traverse the array to find the minimum and maximum indices where the elements are not in their correct positions (i.e., the element at index `i` is not `i + 1`). These indices define the subarray that might need to be reversed.

2. **Check if Already Sorted**:
   - If no such indices are found, the array is already sorted, and we return "0 0".

3. **Reverse the Subarray**:
   - If a subarray is identified, reverse it and check if the resulting array is sorted.

4. **Validation**:
   - If the reversed array is sorted, return the indices of the reversed subarray (adjusted to 1-based indexing). Otherwise, return "0 0".

### Solution Code

import java.util.*;

public class codeforces_56_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        String[] inputArray = scanner.nextLine().split(" ");
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(inputArray[i]);
        }
        int min = N + 1;
        int max = -1;
        for (int i = 0; i < N; i++) {
            if (i + 1 != A[i]) {
                if (i < min) {
                    min = i;
                }
                if (i > max) {
                    max = i;
                }
            }
        }
        if (max == -1) {
            System.out.println("0 0");
        } else {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < min; i++) {
                list.add(A[i]);
            }
            for (int i = max; i >= min; i--) {
                list.add(A[i]);
            }
            for (int i = max + 1; i < N; i++) {
                list.add(A[i]);
            }
            boolean isSorted = true;
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) < list.get(i - 1)) {
                    isSorted = false;
                    break;
                }
            }
            if (isSorted) {
                System.out.println((min + 1) + " " + (max + 1));
            } else {
                System.out.println("0 0");
            }
        }
    }
}


### Explanation
1. **Reading Input**: The input is read and parsed into an integer array.
2. **Finding Indices**: The loop identifies the minimum and maximum indices where elements are out of place.
3. **Check Sorted Condition**: If no elements are out of place, "0 0" is printed.
4. **Reversing Subarray**: The identified subarray is reversed and merged back into the original array.
5. **Check Sorted After Reversal**: The resulting array is checked for sorted order. If sorted, the indices (1-based) are printed; otherwise, "0 0" is printed.

This approach efficiently identifies and verifies the subarray, ensuring the solution is both correct and optimal.

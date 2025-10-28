To solve this problem, we need to determine if there exists at least one pair of elements in the given list such that the second element is not equal to the first and is less than twice the first element. If such a pair exists, we return "YES"; otherwise, we return "NO".

### Approach
1. **Input Handling**: Read the input values and convert them into an integer array.
2. **Sorting**: Sort the array to facilitate the comparison of consecutive elements.
3. **Check Condition**: Iterate through the sorted array and check each consecutive pair of elements. If any pair meets the condition where the second element is not equal to the first and is less than twice the first, return "YES".
4. **Result**: If no such pair is found after checking all elements, return "NO".

### Solution Code

import java.util.Arrays;
import java.util.Scanner;

public class codeforces_108_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String[] input = scanner.nextLine().split(" ");
        int[] a = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            a[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(a);
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1] && a[i] < a[i - 1] * 2) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}


### Explanation
1. **Input Handling**: The code reads the input values using a `Scanner`. The first line is ignored (assuming it's the count of elements, which is not used here), and the second line is split into individual string elements.
2. **Conversion to Integer Array**: Each string element is converted to an integer and stored in an array.
3. **Sorting**: The array is sorted to ensure that we can check consecutive elements in ascending order.
4. **Condition Check**: The loop starts from the second element and checks each element against the previous one. If the current element is not equal to the previous one and is less than twice the previous element, it prints "YES" and exits immediately.
5. **Result**: If the loop completes without finding any valid pair, "NO" is printed.

This approach ensures that we efficiently check the required condition using sorting and a single pass through the array, resulting in a time complexity of O(n log n) due to the sorting step, where n is the number of elements in the array.

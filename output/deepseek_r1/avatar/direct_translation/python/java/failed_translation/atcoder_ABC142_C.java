To solve this problem, we need to read a list of integers, sort them while keeping track of their original positions, and then output the original positions in the sorted order. The solution involves using data structures to maintain the original indices and sorting based on the values.

### Approach
1. **Reading Input**: Read the number of integers and the integers themselves.
2. **Storing with Indices**: Store each integer along with its original index (1-based) using a list of pairs.
3. **Sorting**: Sort the list of pairs based on the integer values.
4. **Extracting Indices**: Extract the original indices from the sorted list.
5. **Output**: Print the sorted indices in the required format.

### Solution Code

import java.util.*;

public class atcoder_ABC142_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        String[] parts = scanner.nextLine().split(" ");
        List<Map.Entry<Integer, Integer>> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(new AbstractMap.SimpleEntry<>(i + 1, Integer.parseInt(parts[i])));
        }
        A.sort(Comparator.comparingInt(Map.Entry::getValue));
        List<Integer> A_ = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : A) {
            A_.add(entry.getKey());
        }
        for (int i = 0; i < A_.size() - 1; i++) {
            System.out.print(A_.get(i) + " ");
        }
        System.out.println(A_.get(A_.size() - 1));
    }
}


### Explanation
1. **Reading Input**: The input is read using a `Scanner` to get the number of integers and the integers themselves.
2. **Storing with Indices**: Each integer is paired with its original index (1-based) using `Map.Entry` and stored in a list.
3. **Sorting**: The list of pairs is sorted based on the integer values using a custom comparator.
4. **Extracting Indices**: After sorting, the original indices are extracted into a separate list.
5. **Output**: The indices are printed in the required format, ensuring the last element is printed without a trailing space.

This approach efficiently handles the problem by maintaining the original indices through sorting and then outputting them in the correct order. The use of `Map.Entry` pairs allows for easy sorting and index retrieval.
